package com.tsfintech.aries.core.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

/**
 * 客户基础信息
 * */
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "uidx_n_ct_ci", columnNames = {"name", "idType", "idNo"})
})
public class Customer extends BaseModel {

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
     * 性别 （0-未知的性别，1-男性，2-女性，9-未说明性别）
     * */
    @Column(length = 10)
    private String gender;

    /**
     * 出生日期 （格式：yyyy-mm-dd）
     * */
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    /**
     * 婚姻状况 （10-未婚，20-已婚，21-初婚，22-再婚，23-复婚，30-丧偶，40-离婚，90-未说明婚姻状况）
     * */
    @Column(length = 10)
    private String maritalStatus;

    /**
     * 最高学历 （10-研究生，20-大学本科[简称“大学”]，30-大学专科和专科院校[简称“大专”]，40-中等专业院校或中等技术院校，
     * 50-技术院校，60-高中，70-初中，80-小学，90-文盲或半文盲，99-未知）
     * */
    @Column(length = 10)
    private String highestAcademicCredential;

    /**
     * 最高学位 （0-其他，1-名誉博士，2-博士，3-硕士，4-学士，9-未知）
     * */
    @Column(length = 10)
    private String highestAcademicDegree;

    /**
     * 住宅电话
     * */
    @Column(length = 16)
    private String homePhoneNo;

    /**
     * 手机号码
     * */
    @Column(length = 25)
    private String mobilePhoneNo;

    /**
     * 单位电话
     * */
    @Column(length = 30)
    private String enterprisePhoneNo;

    /**
     * 电子邮箱
     * */
    @Column(length = 60)
    private String email;

    /**
     * 通讯地址所在区域
     * */
    @Column(length = 6)
    private String mailingDistrict;

    /**
     * 通讯地址
     * */
    @Column(length = 60)
    private String mailingAddress;

    /**
     * 通讯地址邮政编码
     * */
    @Column(length = 60)
    private String mailingZipCode;

    /**
     * 户籍地址
     * */
    @Column(length = 60)
    private String domicileAddress;

    /**
     * 职业
     * */
    @Column(length = 60)
    private String occupation;

    /**
     * 单位名称
     * */
    @Column(length = 60)
    private String enterpriseName;

    /**
     * 单位所属行业 （A-农、林、牧、渔业，B-采掘业，C-制造业，D-电力、燃气及水的生产和供应业，E-建筑业，F-交通运输、仓储和邮政业，
     * G-信息传输、计算机服务和软件业，H-批发和零售业，I-住宿和餐饮业，J-金融业，K-房地产业，L-租赁和商务服务业，
     * M-科学研究、技术服务业和地质勘查业，N-水利、环境和公共设施管理业，o-居民服务和其他服务业，P-教育，Q-卫生、社会保障和社会福利也，
     * R-文化、体育和娱乐业，S-公共管理和社会组织，T-国际组织，Z-未知）
     * */
    @Column(length = 10)
    private String enterpriseIndustry;

    /**
     * 单位地址
     * */
    @Column(length = 60)
    private String enterpriseAddress;

    /**
     * 单位地址邮政编码
     * */
    @Column(length = 60)
    private String enterpriseZipCode;

    /**
     * 本单位工作起始年份 （四位年： YYYY）
     * */
    @Temporal(TemporalType.DATE)
    private Date currentEnterpriseStartWorkingYear;

    /**
     * 职务 （1-高级领导[行政级别局级及局级以上领导或大公司高级管理人员]，2-中级领导[行政级别局级以下领导或大公司中级管理人员]，
     * 3-一般员工，4-其他，9-未知）
     * */
    @Column(length = 10)
    private String position;

    /**
     * 职称 （0-无，1-高级，2-中级，3-初级，9-未知）
     * */
    @Column(length = 10)
    private String professionalTitle;

    /**
     * 年收入
     * */
    @Column
    private BigDecimal annualIncome;

    /**
     * 居住地区
     * */
    @Column(length = 6)
    private String residentialDistrict;

    /**
     * 居住地址
     * */
    @Column(length = 60)
    private String residentialAddress;

    /**
     * 居住地址邮政编码
     * */
    @Column(length = 60)
    private String residentialZipCode;

    /**
     * 居住状况 （1-自置，2-按揭，3-亲属楼宇，4-集体宿舍，5-租房，6-共有住宅，7-其他，9-未知）
     * */
    @Column(length = 10)
    private String residentialStatus;

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

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getHighestAcademicCredential() {
        return highestAcademicCredential;
    }

    public void setHighestAcademicCredential(String highestAcademicCredential) {
        this.highestAcademicCredential = highestAcademicCredential;
    }

    public String getHighestAcademicDegree() {
        return highestAcademicDegree;
    }

    public void setHighestAcademicDegree(String highestAcademicDegree) {
        this.highestAcademicDegree = highestAcademicDegree;
    }

    public String getHomePhoneNo() {
        return homePhoneNo;
    }

    public void setHomePhoneNo(String homePhoneNo) {
        this.homePhoneNo = homePhoneNo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMailingDistrict() {
        return mailingDistrict;
    }

    public void setMailingDistrict(String mailingDistrict) {
        this.mailingDistrict = mailingDistrict;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getMailingZipCode() {
        return mailingZipCode;
    }

    public void setMailingZipCode(String mailingZipCode) {
        this.mailingZipCode = mailingZipCode;
    }

    public String getDomicileAddress() {
        return domicileAddress;
    }

    public void setDomicileAddress(String domicileAddress) {
        this.domicileAddress = domicileAddress;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseIndustry() {
        return enterpriseIndustry;
    }

    public void setEnterpriseIndustry(String enterpriseIndustry) {
        this.enterpriseIndustry = enterpriseIndustry;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseZipCode() {
        return enterpriseZipCode;
    }

    public void setEnterpriseZipCode(String enterpriseZipCode) {
        this.enterpriseZipCode = enterpriseZipCode;
    }

    public Date getCurrentEnterpriseStartWorkingYear() {
        return currentEnterpriseStartWorkingYear;
    }

    public void setCurrentEnterpriseStartWorkingYear(Date currentEnterpriseStartWorkingYear) {
        this.currentEnterpriseStartWorkingYear = currentEnterpriseStartWorkingYear;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getProfessionalTitle() {
        return professionalTitle;
    }

    public void setProfessionalTitle(String professionalTitle) {
        this.professionalTitle = professionalTitle;
    }

    public BigDecimal getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(BigDecimal annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getResidentialDistrict() {
        return residentialDistrict;
    }

    public void setResidentialDistrict(String residentialDistrict) {
        this.residentialDistrict = residentialDistrict;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getResidentialZipCode() {
        return residentialZipCode;
    }

    public void setResidentialZipCode(String residentialZipCode) {
        this.residentialZipCode = residentialZipCode;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }
}
