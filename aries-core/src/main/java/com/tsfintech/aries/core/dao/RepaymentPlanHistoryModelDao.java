package com.tsfintech.aries.core.dao;

import com.tsfintech.aries.core.model.RepaymentPlan;
import com.tsfintech.aries.core.model.RepaymentPlanHistory;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by chaizj on 16/6/3.
 */
public interface RepaymentPlanHistoryModelDao extends JpaRepository<RepaymentPlanHistory, Long> {
    @Query(value = "select repaymentPlanHistory from RepaymentPlanHistory repaymentPlanHistory where loanNo = :loanNo order by startTime desc")
    RepaymentPlanHistory findLastRepaymentPlanHistory(@Param("loanNo") String loanNo, Pageable pageable);
}
