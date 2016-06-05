package com.tsfintech.aries.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *  借贷人联系人信息
 * */
@Entity
public class BorrowerContact extends BaseModel {

    /**
     * 贷款业务号
     * */
    @Column(length = 40, nullable = false)
    private String loanNo;

    /**
     * 与该客户关系
     * */
    @Column(length = 10)
    private String relationship;

    /**
     * 姓名
     * */
    @Column(length = 25)
    private String contactPersonName;

    /**
     * 证件类型 (0-身份证，1-户口簿，2-护照，3-军官证，4-士兵证，5-港澳居民来往内地通行证，6-台湾同胞来往内地通行证，7-临时身份证，
     * 8-外国人居留证，9-警官证，A-香港身份证，B-澳门身份证，C-台湾身份证，X-其他证件)
     * */
    @Column(length = 10)
    private String contactPersonIdType;

    /**
     * 证件号码
     * */
    @Column(length = 50)
    private String contactPersonIdNo;

    /**
     * 联系电话
     * */
    @Column(length = 16)
    private String contactPersonPhoneNo;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonIdType() {
        return contactPersonIdType;
    }

    public void setContactPersonIdType(String contactPersonIdType) {
        this.contactPersonIdType = contactPersonIdType;
    }

    public String getContactPersonIdNo() {
        return contactPersonIdNo;
    }

    public void setContactPersonIdNo(String contactPersonIdNo) {
        this.contactPersonIdNo = contactPersonIdNo;
    }

    public String getContactPersonPhoneNo() {
        return contactPersonPhoneNo;
    }

    public void setContactPersonPhoneNo(String contactPersonPhoneNo) {
        this.contactPersonPhoneNo = contactPersonPhoneNo;
    }
}
