package com.tsfintech.aries.core.dao;

import com.tsfintech.aries.core.model.LoanInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by erric on 6/1/16.
 */
public interface LoanInfoModelDao extends JpaRepository<LoanInfo, Long> {
    @Query(value = "select loanInfo from LoanInfo loanInfo where loanNo = :loanNo")
    LoanInfo findByLoanNo(@Param("loanNo") String loanNo);
}
