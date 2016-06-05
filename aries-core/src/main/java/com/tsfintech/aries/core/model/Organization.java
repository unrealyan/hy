package com.tsfintech.aries.core.model;

import javax.persistence.*;

import com.tsfintech.aries.core.constant.OrgType;

/**
 * 组织机构
 */
@Entity
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    @Version
    private int version;

    /**
     * 机构名称
     * */
    @Column(length = 25, nullable = false)
    private String orgName;

    /**
     * 机构类型
     * */
    @Column(length = 30, nullable = false)
    @Enumerated(EnumType.STRING)
    private OrgType orgType;

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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public OrgType getOrgType() {
        return orgType;
    }

    public void setOrgType(OrgType orgType) {
        this.orgType = orgType;
    }
}
