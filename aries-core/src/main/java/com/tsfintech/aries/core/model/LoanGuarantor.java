package com.tsfintech.aries.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 借款担保人信息
 * */
@Entity
public class LoanGuarantor extends BaseModel {

    /**
     * 贷款业务号
     * */
    @Column(length = 40, nullable = false)
    private String loanNo;

    /**
     * 姓名
     * */
    @Column(length = 25, nullable = false)
    private String name;

    /**
     * 证件类型
     * */
    @Column(length = 10, nullable = false)
    private String idType;

    /**
     * 证件号
     * */
    @Column(length = 50, nullable = false)
    private String idNo;

    /**
     * 电子邮箱
     * */
    @Column(length = 60)
    private String email;

    /**
     * 手机号码
     * */
    @Column(length = 25)
    private String mobilePhoneNo;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhoneNo() {
        return mobilePhoneNo;
    }

    public void setMobilePhoneNo(String mobilePhoneNo) {
        this.mobilePhoneNo = mobilePhoneNo;
    }
}
