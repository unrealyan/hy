package com.tsfintech.aries.core.dao;

import com.tsfintech.aries.core.model.LoanAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by chaizj on 16/6/3.
 */
public interface LoanAccountModelDao extends JpaRepository<LoanAccount, Long> {

    @Query(value = "select loanAccount from LoanAccount loanAccount where loanNo = :loanNo")
    LoanAccount findLoanAccountByLoanNo(@Param("loanNo") String loanNo);
}
