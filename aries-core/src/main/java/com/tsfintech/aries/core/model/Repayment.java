package com.tsfintech.aries.core.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

/**
 * 还款申请
 * */
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "uidx_rpc", columnNames = {"repaymentCode"})
})
public class Repayment extends BaseModel {

    /**
     * 贷款业务号
     * */
    @Column(length = 40, nullable = false)
    private String loanNo;

    /**
     * 还款业务流水
     * */
    @Column(length = 40, nullable = false)
    private String repaymentCode;

    /**
     * 银行交易流水
     * */
    @Column(length = 40, nullable = false)
    private String bankTransCode;

    /**
     * 还款日期
     * */
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date repaymentDate;

    /**
     * 还款总金额
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal totalRepaymentAmount;

    /**
     * 归还正常本金金额
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal normalPrincipleRepayment;

    /**
     * 归还逾期本金金额
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal overduePrincipleRepayment;

    /**
     * 归还逾期本金罚息金额
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal overduePrinciplePenaltyInterestPayment;

    /**
     * 归还正常利息金额
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal normalInterestPayment;

    /**
     * 归还逾期利息金额
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal overdueInterestPayment;

    /**
     * 归还逾期利息罚息金额
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal overdueInterestPenaltyInterestPayment;

    /**
     * 归还费用
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal feePayment;

    /**
     * 还款类型（1-正常收回，2-担保人代还，3-以资抵债，4-提前还款[部分]，5-提前还款[全部]，6-提前还款[部分]非线上，
     * 7-提前还款[全部]非线上，8-正常收回非线上，9-逾期还款，10-逾期还款非线上，100-其他）
     * */
    @Column(length = 10, nullable = false)
    private String repaymentType;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getRepaymentCode() {
        return repaymentCode;
    }

    public void setRepaymentCode(String repaymentCode) {
        this.repaymentCode = repaymentCode;
    }

    public String getBankTransCode() {
        return bankTransCode;
    }

    public void setBankTransCode(String bankTransCode) {
        this.bankTransCode = bankTransCode;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public BigDecimal getTotalRepaymentAmount() {
        return totalRepaymentAmount;
    }

    public void setTotalRepaymentAmount(BigDecimal totalRepaymentAmount) {
        this.totalRepaymentAmount = totalRepaymentAmount;
    }

    public BigDecimal getNormalPrincipleRepayment() {
        return normalPrincipleRepayment;
    }

    public void setNormalPrincipleRepayment(BigDecimal normalPrincipleRepayment) {
        this.normalPrincipleRepayment = normalPrincipleRepayment;
    }

    public BigDecimal getOverduePrincipleRepayment() {
        return overduePrincipleRepayment;
    }

    public void setOverduePrincipleRepayment(BigDecimal overduePrincipleRepayment) {
        this.overduePrincipleRepayment = overduePrincipleRepayment;
    }

    public BigDecimal getOverduePrinciplePenaltyInterestPayment() {
        return overduePrinciplePenaltyInterestPayment;
    }

    public void setOverduePrinciplePenaltyInterestPayment(BigDecimal overduePrinciplePenaltyInterestPayment) {
        this.overduePrinciplePenaltyInterestPayment = overduePrinciplePenaltyInterestPayment;
    }

    public BigDecimal getNormalInterestPayment() {
        return normalInterestPayment;
    }

    public void setNormalInterestPayment(BigDecimal normalInterestPayment) {
        this.normalInterestPayment = normalInterestPayment;
    }

    public BigDecimal getOverdueInterestPayment() {
        return overdueInterestPayment;
    }

    public void setOverdueInterestPayment(BigDecimal overdueInterestPayment) {
        this.overdueInterestPayment = overdueInterestPayment;
    }

    public BigDecimal getOverdueInterestPenaltyInterestPayment() {
        return overdueInterestPenaltyInterestPayment;
    }

    public void setOverdueInterestPenaltyInterestPayment(BigDecimal overdueInterestPenaltyInterestPayment) {
        this.overdueInterestPenaltyInterestPayment = overdueInterestPenaltyInterestPayment;
    }

    public BigDecimal getFeePayment() {
        return feePayment;
    }

    public void setFeePayment(BigDecimal feePayment) {
        this.feePayment = feePayment;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }
}
