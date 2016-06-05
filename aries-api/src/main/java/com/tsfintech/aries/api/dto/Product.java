package com.tsfintech.aries.api.dto;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by erric on 6/2/16.
 */
public class Product {

    @NotNull
    private String loanNo;

    @NotNull
    private String loanContractNo;

    @NotNull
    private String productName;

    @NotNull
    private String productType;

    @NotNull
    private String repaymentMethod;

    @NotNull
    private String repaymentFrequency;

    @NotNull
    private String currency;

    private BigDecimal totalLoanAmount;

    private BigDecimal loanInterestRate;

    private BigDecimal penaltyInterestRatePerDay;

    @NotNull
    private String tenor;

    @NotNull
    private String startDate;

    @NotNull
    private String endDate;

    @NotNull
    private String applicationDate;


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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getRepaymentMethod() {
        return repaymentMethod;
    }

    public void setRepaymentMethod(String repaymentMethod) {
        this.repaymentMethod = repaymentMethod;
    }

    public String getRepaymentFrequency() {
        return repaymentFrequency;
    }

    public void setRepaymentFrequency(String repaymentFrequency) {
        this.repaymentFrequency = repaymentFrequency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getTotalLoanAmount() {
        return totalLoanAmount;
    }

    public void setTotalLoanAmount(BigDecimal totalLoanAmount) {
        this.totalLoanAmount = totalLoanAmount;
    }

    public BigDecimal getLoanInterestRate() {
        return loanInterestRate;
    }

    public void setLoanInterestRate(BigDecimal loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
    }

    public BigDecimal getPenaltyInterestRatePerDay() {
        return penaltyInterestRatePerDay;
    }

    public void setPenaltyInterestRatePerDay(BigDecimal penaltyInterestRatePerDay) {
        this.penaltyInterestRatePerDay = penaltyInterestRatePerDay;
    }

    public String getTenor() {
        return tenor;
    }

    public void setTenor(String tenor) {
        this.tenor = tenor;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }
}
