package com.tsfintech.aries.api.dto;

public class CustomerSpouse {
    /*
    配偶姓名
     */
    private String spouseName;

    /*
    配偶证件类型 (0-身份证，1-户口簿，2-护照，3-军官证，4-士兵证，5-港澳居民来往内地通行证，6-台湾同胞来往内地通行证，7-临时身份证，
    8-外国人居留证，9-警官证，A-香港身份证，B-澳门身份证，C-台湾身份证，X-其他证件)
     */
    private String spouseIdType;

    /*
    配偶证件号码
     */
    private String spouseIdNo;

    /*
    配偶工作单位
     */
    private String spouseEnterprise;

    /*
    配偶联系电话
     */
    private String spousePhoneNo;

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
