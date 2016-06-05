package com.tsfintech.aries.core.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 产品信息
 * */
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "uidx_lc", columnNames = "loanNo")
})
public class LoanInfo extends BaseModel {

    /**
     * 贷款业务号
     * */
    @Column(length = 40, nullable = false)
    private String loanNo;

    /**
     * 贷款合同号
     * */
    @Column(length = 40, nullable = false)
    private String loanContractNo;

    /**
     * 产品名称
     * */
    @Column(length = 40, nullable = false)
    private String productName;

    /**
     * 业务种类细分
     * */
    @Column(length = 10, nullable = false)
    private String businessType;

    /**
     * 还款方式
     * */
    @Column(length = 10, nullable = false)
    private String repaymentType;

    /**
     * 还款频率
     * */
    @Column(length = 10, nullable = false)
    private String repaymentFreq;

    /**
     * 币种
     * */
    @Column(length = 10, nullable = false)
    private String currency;

    /**
     * 贷款总额
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal loanAmount;

    /**
     *  贷款利率
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal loanRate;

    /**
     * 罚息日利息
     * */
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal forfeitRate;

    /**
     * 期限
     * */
    @Column(length = 10, nullable = false)
    private String repaymentTerm;

    /**
     * 担保人合同编号
     * */
    @Column(length = 40)
    private String guaranteeContractNo;

    /**
     * 抵押合同编号
     * */
    @Column(length = 40)
    private String pledgeContractNo;

    /**
     * 抵押物类型
     * */
    @Column(length = 10)
    private String pledgeType;

    /**
     * 抵押物属性
     * */
    @Column(length = 255)
    private String pledgeInfo;

    /**
     * 开始日期
     * */
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    /**
     * 结束日期
     * */
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date endDate;

    /**
     * 申请日期
     * */
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date applyDate;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getLoanContractNo() {
        return loanContractNo;
    }

    public void setLoanContractNo(String loanContractNo) {
        this.loanContractNo = loanContractNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    public String getRepaymentFreq() {
        return repaymentFreq;
    }

    public void setRepaymentFreq(String repaymentFreq) {
        this.repaymentFreq = repaymentFreq;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public BigDecimal getForfeitRate() {
        return forfeitRate;
    }

    public void setForfeitRate(BigDecimal forfeitRate) {
        this.forfeitRate = forfeitRate;
    }

    public String getRepaymentTerm() {
        return repaymentTerm;
    }

    public void setRepaymentTerm(String repaymentTerm) {
        this.repaymentTerm = repaymentTerm;
    }

    public String getGuaranteeContractNo() {
        return guaranteeContractNo;
    }

    public void setGuaranteeContractNo(String guaranteeContractNo) {
        this.guaranteeContractNo = guaranteeContractNo;
    }

    public String getPledgeContractNo() {
        return pledgeContractNo;
    }

    public void setPledgeContractNo(String pledgeContractNo) {
        this.pledgeContractNo = pledgeContractNo;
    }

    public String getPledgeType() {
        return pledgeType;
    }

    public void setPledgeType(String pledgeType) {
        this.pledgeType = pledgeType;
    }

    public String getPledgeInfo() {
        return pledgeInfo;
    }

    public void setPledgeInfo(String pledgeInfo) {
        this.pledgeInfo = pledgeInfo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }
}
