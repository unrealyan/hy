package com.tsfintech.aries.core.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "uidx_lc_s", columnNames = {"loanNo", "period"})
})
public class RepaymentPlan extends BaseModel {

    /**
     * 贷款业务号
     * */
    @Column(length = 40, nullable = false)
    private String loanNo;

    /**
     * 期次
     * */
    @Column(nullable = false)
    private int period;

    /**
     * 贷款起息日
     * */
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date loanValueDate;

    /**
     * 应还款日期
     * */
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date repaymentDatePlanned;

    /**
     * 应还本金
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal principleToBeRepaid;

    /**
     * 应还利息
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal interestToBePaid;

    /**
     * 应还本金罚息
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal principlePenaltyInterestToBePaid;

    /**
     * 应还利息罚息
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal interestPenaltyInterestToBePaid;

    /**
     * 应还费用总计
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal totalFeeToBePaid;

    /**
     * 实还本金
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal principleRepaid;

    /**
     * 实还利息
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal interestPaid;

    /**
     * 实还本金罚息
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal principlePenaltyInterestPaid;

    /**
     * 实还利息罚息
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal interestPenaltyInterestPaid;

    /**
     * 实还费用总计
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal totalFeePaid;

    /**
     * 本期结清标 （0-本期结清，1-本期未结清）
     * */
    @Column(nullable = false)
    private boolean currentPeriodclearingStatus;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Date getLoanValueDate() {
        return loanValueDate;
    }

    public void setLoanValueDate(Date loanValueDate) {
        this.loanValueDate = loanValueDate;
    }

    public Date getRepaymentDatePlanned() {
        return repaymentDatePlanned;
    }

    public void setRepaymentDatePlanned(Date repaymentDatePlanned) {
        this.repaymentDatePlanned = repaymentDatePlanned;
    }

    public BigDecimal getPrincipleToBeRepaid() {
        return principleToBeRepaid;
    }

    public void setPrincipleToBeRepaid(BigDecimal principleToBeRepaid) {
        this.principleToBeRepaid = principleToBeRepaid;
    }

    public BigDecimal getInterestToBePaid() {
        return interestToBePaid;
    }

    public void setInterestToBePaid(BigDecimal interestToBePaid) {
        this.interestToBePaid = interestToBePaid;
    }

    public BigDecimal getPrinciplePenaltyInterestToBePaid() {
        return principlePenaltyInterestToBePaid;
    }

    public void setPrinciplePenaltyInterestToBePaid(BigDecimal principlePenaltyInterestToBePaid) {
        this.principlePenaltyInterestToBePaid = principlePenaltyInterestToBePaid;
    }

    public BigDecimal getInterestPenaltyInterestToBePaid() {
        return interestPenaltyInterestToBePaid;
    }

    public void setInterestPenaltyInterestToBePaid(BigDecimal interestPenaltyInterestToBePaid) {
        this.interestPenaltyInterestToBePaid = interestPenaltyInterestToBePaid;
    }

    public BigDecimal getTotalFeeToBePaid() {
        return totalFeeToBePaid;
    }

    public void setTotalFeeToBePaid(BigDecimal totalFeeToBePaid) {
        this.totalFeeToBePaid = totalFeeToBePaid;
    }

    public BigDecimal getPrincipleRepaid() {
        return principleRepaid;
    }

    public void setPrincipleRepaid(BigDecimal principleRepaid) {
        this.principleRepaid = principleRepaid;
    }

    public BigDecimal getInterestPaid() {
        return interestPaid;
    }

    public void setInterestPaid(BigDecimal interestPaid) {
        this.interestPaid = interestPaid;
    }

    public BigDecimal getPrinciplePenaltyInterestPaid() {
        return principlePenaltyInterestPaid;
    }

    public void setPrinciplePenaltyInterestPaid(BigDecimal principlePenaltyInterestPaid) {
        this.principlePenaltyInterestPaid = principlePenaltyInterestPaid;
    }

    public BigDecimal getInterestPenaltyInterestPaid() {
        return interestPenaltyInterestPaid;
    }

    public void setInterestPenaltyInterestPaid(BigDecimal interestPenaltyInterestPaid) {
        this.interestPenaltyInterestPaid = interestPenaltyInterestPaid;
    }

    public BigDecimal getTotalFeePaid() {
        return totalFeePaid;
    }

    public void setTotalFeePaid(BigDecimal totalFeePaid) {
        this.totalFeePaid = totalFeePaid;
    }

    public boolean isCurrentPeriodclearingStatus() {
        return currentPeriodclearingStatus;
    }

    public void setCurrentPeriodclearingStatus(boolean currentPeriodclearingStatus) {
        this.currentPeriodclearingStatus = currentPeriodclearingStatus;
    }
}
