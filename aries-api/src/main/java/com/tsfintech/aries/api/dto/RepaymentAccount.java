package com.tsfintech.aries.api.dto;

import com.tsfintech.rest.core.meta.RestEntity;

import javax.validation.constraints.NotNull;

@RestEntity
public class RepaymentAccount {
    /*
    贷款业务号
     */
    @NotNull
    private String loanNo;

    /*
    原扣款账户账号
     */
    @NotNull
    private String debitAccountNo;

    /*
    原扣款账户开户支行
     */
    @NotNull
    private String debitAccountBranch;

    /*
    原扣款账户户名
     */
    @NotNull
    private String debitAccountName;

    /*
    新扣款账户账号
     */
    @NotNull
    private String newDebitAccountNo;

    /*
    新扣款账户开户支行
     */
    @NotNull
    private String newDebitAccountBranch;

    /*
    新扣款账户户名
     */
    @NotNull
    private String newDebitAccountName;


    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getDebitAccountNo() {
        return debitAccountNo;
    }

    public void setDebitAccountNo(String debitAccountNo) {
        this.debitAccountNo = debitAccountNo;
    }

    public String getDebitAccountBranch() {
        return debitAccountBranch;
    }

    public void setDebitAccountBranch(String debitAccountBranch) {
        this.debitAccountBranch = debitAccountBranch;
    }

    public String getDebitAccountName() {
        return debitAccountName;
    }

    public void setDebitAccountName(String debitAccountName) {
        this.debitAccountName = debitAccountName;
    }

    public String getNewDebitAccountNo() {
        return newDebitAccountNo;
    }

    public void setNewDebitAccountNo(String newDebitAccountNo) {
        this.newDebitAccountNo = newDebitAccountNo;
    }

    public String getNewDebitAccountBranch() {
        return newDebitAccountBranch;
    }

    public void setNewDebitAccountBranch(String newDebitAccountBranch) {
        this.newDebitAccountBranch = newDebitAccountBranch;
    }

    public String getNewDebitAccountName() {
        return newDebitAccountName;
    }

    public void setNewDebitAccountName(String newDebitAccountName) {
        this.newDebitAccountName = newDebitAccountName;
    }
}