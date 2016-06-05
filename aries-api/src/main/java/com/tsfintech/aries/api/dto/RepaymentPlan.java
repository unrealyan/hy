package com.tsfintech.aries.api.dto;

import com.tsfintech.rest.core.meta.RestEntity;

import javax.validation.constraints.NotNull;

@RestEntity
public class RepaymentPlan {
    @NotNull
    private String loanNo;
    @NotNull
    private Integer period;
    @NotNull
    private String loanValueDate;
    @NotNull
    private String repaymentDatePlanned;
    @NotNull
    private Float principleToBeRepaid;
    @NotNull
    private Float interestToBePaid;
    @NotNull
    private Float principlePenaltyInterestToBePaid;
    @NotNull
    private Float interestPenaltyInterestToBePaid;
    @NotNull
    private Float totalFeeToBePaid;
    @NotNull
    private Float principleRepaid;
    @NotNull
    private Float interestPaid;
    @NotNull
    private Float principlePenaltyInterestPaid;
    @NotNull
    private Float interestPenaltyInterestPaid;
    @NotNull
    private Float totalFeePaid;
    @NotNull
    private String currentPeriodClearingStatus;
    @NotNull
    private String reasonForChange;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getLoanValueDate() {
        return loanValueDate;
    }

    public void setLoanValueDate(String loanValueDate) {
        this.loanValueDate = loanValueDate;
    }

    public String getRepaymentDatePlanned() {
        return repaymentDatePlanned;
    }

    public void setRepaymentDatePlanned(String repaymentDatePlanned) {
        this.repaymentDatePlanned = repaymentDatePlanned;
    }

    public Float getPrincipleToBeRepaid() {
        return principleToBeRepaid;
    }

    public void setPrincipleToBeRepaid(Float principleToBeRepaid) {
        this.principleToBeRepaid = principleToBeRepaid;
    }

    public Float getInterestToBePaid() {
        return interestToBePaid;
    }

    public void setInterestToBePaid(Float interestToBePaid) {
        this.interestToBePaid = interestToBePaid;
    }

    public Float getPrinciplePenaltyInterestToBePaid() {
        return principlePenaltyInterestToBePaid;
    }

    public void setPrinciplePenaltyInterestToBePaid(Float principlePenaltyInterestToBePaid) {
        this.principlePenaltyInterestToBePaid = principlePenaltyInterestToBePaid;
    }

    public Float getInterestPenaltyInterestToBePaid() {
        return interestPenaltyInterestToBePaid;
    }

    public void setInterestPenaltyInterestToBePaid(Float interestPenaltyInterestToBePaid) {
        this.interestPenaltyInterestToBePaid = interestPenaltyInterestToBePaid;
    }

    public Float getTotalFeeToBePaid() {
        return totalFeeToBePaid;
    }

    public void setTotalFeeToBePaid(Float totalFeeToBePaid) {
        this.totalFeeToBePaid = totalFeeToBePaid;
    }

    public Float getPrincipleRepaid() {
        return principleRepaid;
    }

    public void setPrincipleRepaid(Float principleRepaid) {
        this.principleRepaid = principleRepaid;
    }

    public Float getInterestPaid() {
        return interestPaid;
    }

    public void setInterestPaid(Float interestPaid) {
        this.interestPaid = interestPaid;
    }

    public Float getPrinciplePenaltyInterestPaid() {
        return principlePenaltyInterestPaid;
    }

    public void setPrinciplePenaltyInterestPaid(Float principlePenaltyInterestPaid) {
        this.principlePenaltyInterestPaid = principlePenaltyInterestPaid;
    }

    public Float getInterestPenaltyInterestPaid() {
        return interestPenaltyInterestPaid;
    }

    public void setInterestPenaltyInterestPaid(Float interestPenaltyInterestPaid) {
        this.interestPenaltyInterestPaid = interestPenaltyInterestPaid;
    }

    public Float getTotalFeePaid() {
        return totalFeePaid;
    }

    public void setTotalFeePaid(Float totalFeePaid) {
        this.totalFeePaid = totalFeePaid;
    }

    public String getCurrentPeriodClearingStatus() {
        return currentPeriodClearingStatus;
    }

    public void setCurrentPeriodClearingStatus(String currentPeriodClearingStatus) {
        this.currentPeriodClearingStatus = currentPeriodClearingStatus;
    }

    public String getReasonForChange() {
        return reasonForChange;
    }

    public void setReasonForChange(String reasonForChange) {
        this.reasonForChange = reasonForChange;
    }
}