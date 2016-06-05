package com.tsfintech.aries.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 影像信息
 * */
@Entity
public class LoanImageDoc extends BaseModel {

    /**
     * 贷款业务号
     * */
    @Column(length = 40, nullable = false)
    private String loanNo;

    /**
     * 图片相对路径
     * */
    @Column(length = 255, nullable = false)
    private String imgPath;

    /**
     * 图片名称
     * */
    @Column(length = 20, nullable = false)
    private String imgName;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
}
