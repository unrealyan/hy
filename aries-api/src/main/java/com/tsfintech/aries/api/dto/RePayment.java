package com.tsfintech.aries.api.dto;

import com.tsfintech.rest.core.meta.RestEntity;

import javax.validation.constraints.NotNull;

/**
 * 还款申请 Request
 */
@RestEntity
public class RePayment {

    /*
    贷款业务号
     */

    @NotNull
    private String loanNo;

    /*
    还款日期
     */
    @NotNull
    private String repaymentDate;

    /*
    还款总金额
     */
    @NotNull
    private float totalRepaymentAmount;

    /*
    归还正常本金金额
     */
    @NotNull
    private float normalPrincipleRepayment;

    /*
    归还逾期本金金额
     */
    @NotNull
    private float overduePrincipleRepayment;

    /*
    归还逾期本金罚息金额
     */
    @NotNull
    private float overduePrinciplePenaltyInterestPayment;

    /*
    归还正常利息金额
     */
    @NotNull
    private float normalInterestPayment;

    /*
    归还逾期利息金额
     */
    @NotNull
    private float overdueInterestPayment;

    /*
    归还逾期利息罚息金额
     */
    @NotNull
    private float overdueInterestPenaltyInterestPayment;

    /*
    归还费用
     */
    @NotNull
    private float feePayment;

    /*
    还款类型（1-正常收回，2-担保人代还，3-以资抵债，4-提前还款[部分]，5-提前还款[全部]，6-提前还款[部分]非线上，
    7-提前还款[全部]非线上，8-正常收回非线上，9-逾期还款，10-逾期还款非线上，100-其他）
     */
    @NotNull
    private String repaymentType;


    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public float getTotalRepaymentAmount() {
        return totalRepaymentAmount;
    }

    public void setTotalRepaymentAmount(float totalRepaymentAmount) {
        this.totalRepaymentAmount = totalRepaymentAmount;
    }

    public float getNormalPrincipleRepayment() {
        return normalPrincipleRepayment;
    }

    public void setNormalPrincipleRepayment(float normalPrincipleRepayment) {
        this.normalPrincipleRepayment = normalPrincipleRepayment;
    }

    public float getOverduePrincipleRepayment() {
        return overduePrincipleRepayment;
    }

    public void setOverduePrincipleRepayment(float overduePrincipleRepayment) {
        this.overduePrincipleRepayment = overduePrincipleRepayment;
    }

    public float getOverduePrinciplePenaltyInterestPayment() {
        return overduePrinciplePenaltyInterestPayment;
    }

    public void setOverduePrinciplePenaltyInterestPayment(float overduePrinciplePenaltyInterestPayment) {
        this.overduePrinciplePenaltyInterestPayment = overduePrinciplePenaltyInterestPayment;
    }

    public float getNormalInterestPayment() {
        return normalInterestPayment;
    }

    public void setNormalInterestPayment(float normalInterestPayment) {
        this.normalInterestPayment = normalInterestPayment;
    }

    public float getOverdueInterestPayment() {
        return overdueInterestPayment;
    }

    public void setOverdueInterestPayment(float overdueInterestPayment) {
        this.overdueInterestPayment = overdueInterestPayment;
    }

    public float getOverdueInterestPenaltyInterestPayment() {
        return overdueInterestPenaltyInterestPayment;
    }

    public void setOverdueInterestPenaltyInterestPayment(float overdueInterestPenaltyInterestPayment) {
        this.overdueInterestPenaltyInterestPayment = overdueInterestPenaltyInterestPayment;
    }

    public float getFeePayment() {
        return feePayment;
    }

    public void setFeePayment(float feePayment) {
        this.feePayment = feePayment;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }
}