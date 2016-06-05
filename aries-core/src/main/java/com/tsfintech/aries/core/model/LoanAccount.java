package com.tsfintech.aries.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 账户信息
 * */
@Entity
public class LoanAccount extends BaseModel {

    /**
     * 贷款业务号
     * */
    @Column(length = 40, nullable = false)
    private String loanNo;

    /**
     * 放款金融机构
     * */
    @Column(length = 60, nullable = false)
    private String loanIssuingFinancialInstitution;

    /**
     * 放款机构账户户名
     * */
    @Column(length = 30, nullable = false)
    private String loanIssuerAccountName;

    /**
     * 放款机构账户账号
     * */
    @Column(length = 60, nullable = false)
    private String loanIssuerAccountNo;

    /**
     * 放款机构账户开户行
     * */
    @Column(length = 60, nullable = false)
    private String loanIssuerAccountBank;

    /**
     *  收款方账户户名
     * */
    @Column(length = 30, nullable = false)
    private String beneAccountName;

    /**
     * 收款方账户账号
     * */
    @Column(length = 60, nullable = false)
    private String beneAccountNo;

    /**
     *  收款方账户开户支行
     * */
    @Column(length = 60, nullable = false)
    private String beneAccountBranch;

    /**
     *  回款机构账户户名
     * */
    @Column(length = 30, nullable = false)
    private String loanRepaymentBeneAccountName;

    /**
     *  回款机构账户账号
     * */
    @Column(length = 60, nullable = false)
    private String loanRepaymentBeneAccountNo;

    /**
     *  回款机构账户开户行
     * */
    @Column(length = 60, nullable = false)
    private String loanRepaymentBeneAccountBank;

    /**
     * 扣款方账户户名
     * */
    @Column(length = 30, nullable = false)
    private String debitAccountName;

    /**
     *  扣款方账户账号
     * */
    @Column(length = 60, nullable = false)
    private String debitAccountNo;

    /**
     *  扣款方账户开户行
     * */
    @Column(length = 60, nullable = false)
    private String debitAccountBank;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getLoanIssuingFinancialInstitution() {
        return loanIssuingFinancialInstitution;
    }

    public void setLoanIssuingFinancialInstitution(String loanIssuingFinancialInstitution) {
        this.loanIssuingFinancialInstitution = loanIssuingFinancialInstitution;
    }

    public String getLoanIssuerAccountName() {
        return loanIssuerAccountName;
    }

    public void setLoanIssuerAccountName(String loanIssuerAccountName) {
        this.loanIssuerAccountName = loanIssuerAccountName;
    }

    public String getLoanIssuerAccountNo() {
        return loanIssuerAccountNo;
    }

    public void setLoanIssuerAccountNo(String loanIssuerAccountNo) {
        this.loanIssuerAccountNo = loanIssuerAccountNo;
    }

    public String getLoanIssuerAccountBank() {
        return loanIssuerAccountBank;
    }

    public void setLoanIssuerAccountBank(String loanIssuerAccountBank) {
        this.loanIssuerAccountBank = loanIssuerAccountBank;
    }

    public String getBeneAccountName() {
        return beneAccountName;
    }

    public void setBeneAccountName(String beneAccountName) {
        this.beneAccountName = beneAccountName;
    }

    public String getBeneAccountNo() {
        return beneAccountNo;
    }

    public void setBeneAccountNo(String beneAccountNo) {
        this.beneAccountNo = beneAccountNo;
    }

    public String getBeneAccountBranch() {
        return beneAccountBranch;
    }

    public void setBeneAccountBranch(String beneAccountBranch) {
        this.beneAccountBranch = beneAccountBranch;
    }

    public String getLoanRepaymentBeneAccountName() {
        return loanRepaymentBeneAccountName;
    }

    public void setLoanRepaymentBeneAccountName(String loanRepaymentBeneAccountName) {
        this.loanRepaymentBeneAccountName = loanRepaymentBeneAccountName;
    }

    public String getLoanRepaymentBeneAccountNo() {
        return loanRepaymentBeneAccountNo;
    }

    public void setLoanRepaymentBeneAccountNo(String loanRepaymentBeneAccountNo) {
        this.loanRepaymentBeneAccountNo = loanRepaymentBeneAccountNo;
    }

    public String getLoanRepaymentBeneAccountBank() {
        return loanRepaymentBeneAccountBank;
    }

    public void setLoanRepaymentBeneAccountBank(String loanRepaymentBeneAccountBank) {
        this.loanRepaymentBeneAccountBank = loanRepaymentBeneAccountBank;
    }

    public String getDebitAccountName() {
        return debitAccountName;
    }

    public void setDebitAccountName(String debitAccountName) {
        this.debitAccountName = debitAccountName;
    }

    public String getDebitAccountNo() {
        return debitAccountNo;
    }

    public void setDebitAccountNo(String debitAccountNo) {
        this.debitAccountNo = debitAccountNo;
    }

    public String getDebitAccountBank() {
        return debitAccountBank;
    }

    public void setDebitAccountBank(String debitAccountBank) {
        this.debitAccountBank = debitAccountBank;
    }
}
