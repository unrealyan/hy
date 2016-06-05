package com.tsfintech.aries.core.model;

import java.util.Date;

import javax.persistence.*;

import com.tsfintech.aries.core.constant.OperatorStatus;
import com.tsfintech.aries.core.constant.OperatorType;

/**
 * 操作员
 * */
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "uidx_optc", columnNames = "operatorCode"),
        @UniqueConstraint(name = "uidx_usn", columnNames = "username")
})
public class Operator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    @Version
    private int version;

    @Column(nullable = false)
    private long orgId;

    @Column(length = 40, nullable = false)
    private String operatorCode;

    /**
     * 昵称
     * */
    @Column(length = 25, nullable = false)
    private String operatorName;

    /**
     * 真实姓名
     * */
    @Column(length = 25, nullable = false)
    private String username;

    /**
     * 密码
     * */
    @Column(length = 60, nullable = false)
    private String password;

    /**
     * 操作员状态
     * */
    @Column(length = 30, nullable = false)
    @Enumerated(EnumType.STRING)
    private OperatorStatus status;

    /**
     * 操作员类型
     * */
    @Column(length = 30, nullable = false)
    @Enumerated(EnumType.STRING)
    private OperatorType operatorType;

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
     * 性别
     * */
    @Column(length = 10)
    private String gender;

    /**
     * 出生日期
     * */
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    /**
     * 电子邮件
     * */
    @Column(length = 60, nullable = false)
    private String email;

    /**
     * 手机号码
     * */
    @Column(length = 25, nullable = false)
    private String mobilePhoneNo;

    /**
     * 单位电话
     * */
    @Column(length = 30, nullable = false)
    private String enterprisePhoneNo;

    /**
     * 备注信息
     * */
    @Column(length = 255)
    private String memo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getOrgId() {
        return orgId;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public OperatorStatus getStatus() {
        return status;
    }

    public void setStatus(OperatorStatus status) {
        this.status = status;
    }

    public OperatorType getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(OperatorType operatorType) {
        this.operatorType = operatorType;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getEnterprisePhoneNo() {
        return enterprisePhoneNo;
    }

    public void setEnterprisePhoneNo(String enterprisePhoneNo) {
        this.enterprisePhoneNo = enterprisePhoneNo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
