package com.tsfintech.aries.core.dao;

import com.tsfintech.aries.core.model.LoanAccount;
import com.tsfintech.aries.core.model.LoanAccountHistory;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by chaizj on 16/6/3.
 */
public interface LoanAccountHistoryModelDao extends JpaRepository<LoanAccountHistory, Long> {

    @Query(value = "select loanAccountHistory from LoanAccountHistory loanAccountHistory where loanNo = :loanNo order by startTime desc")
    LoanAccountHistory findLastLoanAccountHistory(@Param("loanNo") String loanNo, Pageable pageable);
}
