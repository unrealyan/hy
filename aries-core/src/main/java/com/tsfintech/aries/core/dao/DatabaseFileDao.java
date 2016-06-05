package com.tsfintech.aries.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsfintech.aries.core.model.DatabaseFile;

public interface DatabaseFileDao extends JpaRepository<DatabaseFile, Long> {
}
