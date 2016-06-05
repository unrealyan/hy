package com.tsfintech.aries.core.dao;

import com.tsfintech.aries.core.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chaizj on 16/6/2.
 */
public interface CustomerModelDao extends JpaRepository<Customer, Long> {
}
