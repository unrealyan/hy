package com.tsfintech.aries.api.dto;

import com.tsfintech.rest.core.meta.RestEntity;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@RestEntity
public class Loan {

    /*
    客户基本信息
     */
    @NotNull
    @Valid
    private CustomerBase customerBase;

    /*
    配偶信息
     */
    @NotNull
    @Valid
    private CustomerSpouse customerSpouse;

    /*
    联系人信息
     */
    @NotNull
    @Valid
    private CustomerContact customerContact;

    /*
    产品信息
     */
    @NotNull
    @Valid
    private Product product;

    /*
    账号信息
     */
    @NotNull
    @Valid
    private Account account;

    /*
    影印资料
     */
    private List<ImgDocs> imgDocses = new ArrayList<>();

    public CustomerBase getCustomerBase() {
        return customerBase;
    }

    public void setCustomerBase(CustomerBase customerBase) {
        this.customerBase = customerBase;
    }

    public CustomerSpouse getCustomerSpouse() {
        return customerSpouse;
    }

    public void setCustomerSpouse(CustomerSpouse customerSpouse) {
        this.customerSpouse = customerSpouse;
    }

    public CustomerContact getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(CustomerContact customerContact) {
        this.customerContact = customerContact;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<ImgDocs> getImgDocses() {
        return imgDocses;
    }

    public void setImgDocses(List<ImgDocs> imgDocses) {
        this.imgDocses = imgDocses;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "customerBase=" + customerBase +
                ", customerSpouse=" + customerSpouse +
                ", customerContact=" + customerContact +
                ", product=" + product +
                ", account=" + account +
                ", imgDocses=" + imgDocses +
                '}';
    }
}
