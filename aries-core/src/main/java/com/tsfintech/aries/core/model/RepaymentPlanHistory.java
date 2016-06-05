package com.tsfintech.aries.core.model;

import java.util.Date;

import javax.persistence.*;

/**
 * 还款计划历史
 * */
@Entity
public class RepaymentPlanHistory extends BaseModel {

    /**
     * 贷款业务号
     * */
    @Column(length = 40, nullable = false)
    private String loanNo;

    /**
     * 还款计划号
     * */
    @Column(nullable = false)
    private long repaymentPlanId;

    /**
     * 历史还款计划
     * */
    @Lob
    @Column(nullable = false)
    private String repaymentPlanJson;

    /**
     * 开始时间
     * */
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    /**
     * 结束时间
     * */
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    /**
     * 变更原因
     * */
    @Column(length = 60)
    private String reasonForChange;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public long getRepaymentPlanId() {
        return repaymentPlanId;
    }

    public void setRepaymentPlanId(long repaymentPlanId) {
        this.repaymentPlanId = repaymentPlanId;
    }

    public String getRepaymentPlanJson() {
        return repaymentPlanJson;
    }

    public void setRepaymentPlanJson(String repaymentPlanJson) {
        this.repaymentPlanJson = repaymentPlanJson;
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
