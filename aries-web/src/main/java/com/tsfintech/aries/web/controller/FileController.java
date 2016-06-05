package com.tsfintech.aries.web.controller;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.tsfintech.aries.core.model.DatabaseFile;
import com.tsfintech.aries.web.file.FileStorage;

@Controller
public class FileController {

    @Autowired
    private FileStorage fileStorage;

    @RequestMapping(value = "/files/{userId}/{fileId}", method = RequestMethod.GET)
    public void handleFileDownload(@PathVariable("userId") long orgId,
                                   @PathVariable("fileId") long fileId,
                                   HttpServletRequest request,
                                   HttpServletResponse response) throws Exception {

        DatabaseFile file = fileStorage.retrieveAsFile(orgId, fileId);
        String agent = request.getHeader("USER-AGENT");
        response.setBufferSize(1024);
        response.setContentType(file.getContentType());
        if (agent.contains("Firefox")) {
            response.setHeader("Content-Disposition", "attachment; filename=" + new String(file.getFileName().getBytes("UTF-8"), "ISO8859-1"));
        } else {
            response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(file.getFileName(), "UTF-8"));
        }
        response.setContentLength((int) file.getFileSize());
        byte[] fileContent = file.getFileContent();
        response.getOutputStream().write(fileContent == null ? new byte[]{} : fileContent);

        response.flushBuffer();
    }

    @RequestMapping(value = "/files/{userId}", method = RequestMethod.POST)
    @ResponseBody
    public DatabaseFile handleFileUpload(@PathVariable("userId") final long orgId,
                                       @RequestParam("file") final MultipartFile file) throws Exception {

        final byte[] content = file.getBytes();
        final int size = (int) file.getSize();
        DatabaseFile hermesFile = new DatabaseFile();
        hermesFile.setContentType(file.getContentType());
        hermesFile.setFileName(FilenameUtils.getName(file.getOriginalFilename()));
        hermesFile.setLowerOrgId(orgId);
        hermesFile.setFileSize(size);
        hermesFile.setFileContent(content);
        fileStorage.saveAsFile(orgId, hermesFile);
        return hermesFile;
    }

}
