package com.tsfintech.aries.core.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

/**
 * 放款记录
 * */
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "uidx_ldc", columnNames = "lendingCode")
})
public class LendingRecord extends BaseModel{

    /**
     * 贷款业务号
     * */
    @Column(length = 40, nullable = false)
    private String loanNo;

    /**
     * 放款流水号
     * */
    @Column(length = 40, nullable = false)
    private String lendingCode;

    /**
     * 银行交易流水
     * */
    @Column(length = 40, nullable = false)
    private String bankTransCode;

    /**
     * 放款日期
     * */
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date lendingDate;

    /**
     * 放款金额
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal lendingAmount;

    /**
     * 放款机构账户户名
     * */
    @Column(length = 30, nullable = false)
    private String loanAccountUser;

    /**
     * 放款机构账户账号
     * */
    @Column(length = 60, nullable = false)
    private String loanAccountNo;

    /**
     * 放款机构账户开户行
     * */
    @Column(length = 60, nullable = false)
    private String loanOrgNo;

    /**
     *  收款方账户户名
     * */
    @Column(length = 30, nullable = false)
    private String collectionAccountUser;

    /**
     * 收款方账户账号
     * */
    @Column(length = 60, nullable = false)
    private String collectionAccountNo;

    /**
     *  收款方账户开户支行
     * */
    @Column(length = 60, nullable = false)
    private String collectionOrgNo;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getLendingCode() {
        return lendingCode;
    }

    public void setLendingCode(String lendingCode) {
        this.lendingCode = lendingCode;
    }

    public String getBankTransCode() {
        return bankTransCode;
    }

    public void setBankTransCode(String bankTransCode) {
        this.bankTransCode = bankTransCode;
    }

    public Date getLendingDate() {
        return lendingDate;
    }

    public void setLendingDate(Date lendingDate) {
        this.lendingDate = lendingDate;
    }

    public BigDecimal getLendingAmount() {
        return lendingAmount;
    }

    public void setLendingAmount(BigDecimal lendingAmount) {
        this.lendingAmount = lendingAmount;
    }

    public String getLoanAccountUser() {
        return loanAccountUser;
    }

    public void setLoanAccountUser(String loanAccountUser) {
        this.loanAccountUser = loanAccountUser;
    }

    public String getLoanAccountNo() {
        return loanAccountNo;
    }

    public void setLoanAccountNo(String loanAccountNo) {
        this.loanAccountNo = loanAccountNo;
    }

    public String getLoanOrgNo() {
        return loanOrgNo;
    }

    public void setLoanOrgNo(String loanOrgNo) {
        this.loanOrgNo = loanOrgNo;
    }

    public String getCollectionAccountUser() {
        return collectionAccountUser;
    }

    public void setCollectionAccountUser(String collectionAccountUser) {
        this.collectionAccountUser = collectionAccountUser;
    }

    public String getCollectionAccountNo() {
        return collectionAccountNo;
    }

    public void setCollectionAccountNo(String collectionAccountNo) {
        this.collectionAccountNo = collectionAccountNo;
    }

    public String getCollectionOrgNo() {
        return collectionOrgNo;
    }

    public void setCollectionOrgNo(String collectionOrgNo) {
        this.collectionOrgNo = collectionOrgNo;
    }
}
