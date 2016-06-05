package com.tsfintech.aries.core.dao;

import com.tsfintech.aries.core.model.BorrowerContact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chaizj on 16/6/2.
 */
public interface BorrowerContactModelDao extends JpaRepository<BorrowerContact, Long> {
}
