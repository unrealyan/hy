package com.tsfintech.aries.web.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsfintech.aries.core.dao.DatabaseFileDao;
import com.tsfintech.aries.core.model.DatabaseFile;

@Component
public class FileStorage {

    @Autowired
    private DatabaseFileDao databaseFileDao;

    public long saveAsFile(long downOrgId, DatabaseFile databaseFile) {
        databaseFile.setLowerOrgId(downOrgId);
        databaseFileDao.save(databaseFile);

        return databaseFile.getId();
    }

    public void update(DatabaseFile databaseFile) {
        databaseFileDao.save(databaseFile);
    }

    public DatabaseFile retrieveAsFile(long downOrgId, long fileId) {
        DatabaseFile databaseFile = databaseFileDao.findOne(fileId);

        if(fileId == -1){     //取文件模板
            return databaseFile;
        } else {
            return databaseFile.getLowerOrgId() == downOrgId
                    ? databaseFile : null;
        }
    }

}
