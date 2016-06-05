package com.tsfintech.aries.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 文件信息
 * */
@Entity
public class DatabaseFile extends BaseModel {

    /**
     * 文件内容
     * */
    @Column(columnDefinition = "longblob")
    private byte[] fileContent;

    /**
     * 文件类型
     * */
    private String contentType;

    /**
     * 文件名称
     * */
    private String fileName;

    /**
     * 文件大小
     * */
    private long fileSize;

    /**
     * 文件保存时间
     * */
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime = new Date();

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
