package com.tsfintech.aries.core.model;

import java.util.Date;

import javax.persistence.*;

/**
 * 账户信息历史
 * */
@Entity
public class LoanAccountHistory extends BaseModel {

    /**
     * 贷款业务号
     * */
    @Column(length = 40, nullable = false)
    private String loanNo;

    /**
     * 账户信息ID
     * */
    @Column
    private long loanAccountId;

    /**
     * 历史账户信息
     * */
    @Lob
    @Column(nullable = false)
    private String loanAccountJson;

    /**
     * 本历史账户信息有效期的开始时间
     * */
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    /**
     * 本历史账户信息有效期的结束时间
     * */
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    /**
     * 修改原因
     * */
    @Column(length = 60, nullable = false)
    private String reasonForChange;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public long getLoanAccountId() {
        return loanAccountId;
    }

    public void setLoanAccountId(long loanAccountId) {
        this.loanAccountId = loanAccountId;
    }

    public String getLoanAccountJson() {
        return loanAccountJson;
    }

    public void setLoanAccountJson(String loanAccountJson) {
        this.loanAccountJson = loanAccountJson;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getReasonForChange() {
        return reasonForChange;
    }

    public void setReasonForChange(String reasonForChange) {
        this.reasonForChange = reasonForChange;
    }
}
