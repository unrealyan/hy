package com.tsfintech.aries.core.dao;

import com.tsfintech.aries.core.model.BorrowerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chaizj on 16/6/2.
 */
public interface BorrowInfoModelDao extends JpaRepository<BorrowerInfo, Long> {
}
