package com.tsfintech.aries.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 借贷人配偶信息
 * */
@Entity
public class BorrowerSpouse extends BaseModel {

    /**
     * 贷款业务号
     * */
    @Column(length = 40, nullable = false)
    private String loanNo;

    /**
     * 配偶姓名
     * */
    @Column(length = 25, nullable = false)
    private String spouseName;

    /**
     * 配偶证件类型 (0-身份证，1-户口簿，2-护照，3-军官证，4-士兵证，5-港澳居民来往内地通行证，6-台湾同胞来往内地通行证，7-临时身份证，
     * 8-外国人居留证，9-警官证，A-香港身份证，B-澳门身份证，C-台湾身份证，X-其他证件)
     * */
    @Column(length = 10, nullable = false)
    private String spouseIdType;

    /**
     * 配偶证件号码
     * */
    @Column(length = 50, nullable = false)
    private String spouseIdNo;

    /**
     * 配偶工作单位
     * */
    @Column(length = 60)
    private String spouseEnterprise;

    /**
     * 配偶联系电话
     * */
    @Column(length = 16)
    private String spousePhoneNo;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseIdType() {
        return spouseIdType;
    }

    public void setSpouseIdType(String spouseIdType) {
        this.spouseIdType = spouseIdType;
    }

    public String getSpouseIdNo() {
        return spouseIdNo;
    }

    public void setSpouseIdNo(String spouseIdNo) {
        this.spouseIdNo = spouseIdNo;
    }

    public String getSpouseEnterprise() {
        return spouseEnterprise;
    }

    public void setSpouseEnterprise(String spouseEnterprise) {
        this.spouseEnterprise = spouseEnterprise;
    }

    public String getSpousePhoneNo() {
        return spousePhoneNo;
    }

    public void setSpousePhoneNo(String spousePhoneNo) {
        this.spousePhoneNo = spousePhoneNo;
    }
}
