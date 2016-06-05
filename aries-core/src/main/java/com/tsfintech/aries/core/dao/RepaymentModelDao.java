package com.tsfintech.aries.core.dao;

import com.tsfintech.aries.core.model.LoanInfo;
import com.tsfintech.aries.core.model.Repayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by chaizj on 16/6/3.
 */
public interface RepaymentModelDao extends JpaRepository<Repayment, Long> {
    @Query(value = "select repayment from Repayment repayment where loanNo = :loanNo")
    Repayment findByLoanNo(@Param("loanNo") String loanNo);
}
