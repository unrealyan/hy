package com.tsfintech.aries.core.dao;

import com.tsfintech.aries.core.model.RepaymentPlan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chaizj on 16/6/3.
 */
public interface RepaymentPlanModelDao extends JpaRepository<RepaymentPlan, Long> {
}
