package com.tsfintech.aries.core.model;

import java.util.Date;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    @Version
    private int version;

    /**
     * 上游机构(信托)
     * */
    @Column(nullable = false)
    private long upperOrgId;

    /**
     * 下游机构(微贷)
     * */
    @Column(nullable = false)
    private long lowerOrgId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;

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

    public long getUpperOrgId() {

        return upperOrgId;
    }

    public void setUpperOrgId(long upperOrgId) {
        this.upperOrgId = upperOrgId;
    }

    public long getLowerOrgId() {
        return lowerOrgId;
    }

    public void setLowerOrgId(long lowerOrgId) {
        this.lowerOrgId = lowerOrgId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @PrePersist
    protected void onCreate() {
        updatedTime = createdTime = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedTime = new Date();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseModel baseModel = (BaseModel) o;

        return id == baseModel.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
