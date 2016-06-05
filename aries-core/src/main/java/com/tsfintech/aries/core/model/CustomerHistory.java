package com.tsfintech.aries.core.model;

import java.util.Date;

import javax.persistence.*;

/**
 * 客户信息修改历史
 * */
@Entity
public class CustomerHistory extends BaseModel {

    /**
     * 客户ID
     * */
    @Column(nullable = false)
    private long customerId;

    /**
     * 姓名
     * */
    @Column(length = 25, nullable = false)
    private String name;

    /**
     * 证件类型 (0-身份证，1-户口簿，2-护照，3-军官证，4-士兵证，5-港澳居民来往内地通行证，6-台湾同胞来往内地通行证，7-临时身份证，
     * 8-外国人居留证，9-警官证，A-香港身份证，B-澳门身份证，C-台湾身份证，X-其他证件)
     * */
    @Column(length = 10, nullable = false)
    private String idType;

    /**
     * 证件号码
     * */
    @Column(length = 50, nullable = false)
    private String idNo;

    /**
     * 历史客户信息
     * */
    @Lob
    @Column(nullable = false)
    private String customerJson;

    /**
     * 本历史客户信息有效期的开始时间
     * */
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    /**
     * 本历史客户信息有效期的结束时间
     * */
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    /**
     * 修改原因
     * */
    @Column(length = 60)
    private String reasonForChange;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
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

    public String getCustomerJson() {
        return customerJson;
    }

    public void setCustomerJson(String customerJson) {
        this.customerJson = customerJson;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getReasonForChange() {
        return reasonForChange;
    }

    public void setReasonForChange(String reasonForChange) {
        this.reasonForChange = reasonForChange;
    }
}
