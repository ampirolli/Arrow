package com.example.arrow.arrow.Classes;

import java.math.BigDecimal;

/**
 * Created by anthonypirolli on 6/27/17.
 */

public class Bill {

    //Id's to be used to pull data from the database
    Integer userId;
    Integer billId;
    Integer companyId;

    //Object Traits
    String billCompanyName;
    String billNickname;
    Integer billPaymentDay;
    BigDecimal billPaymentAmount;

    //enum for the frequency of a payment
    enum billPaymentFrequency{
        Weekly, Monthly, Quarterly, BiAnually, Anually
    }

    public Bill(Integer userId, Integer billId, Integer companyId, String billCompanyName, String billNickname, Integer billPaymentDay, BigDecimal billPaymentAmount) {
        this.userId = userId;
        this.billId = billId;
        this.companyId = companyId;
        this.billCompanyName = billCompanyName;
        this.billNickname = billNickname;
        this.billPaymentDay = billPaymentDay;
        this.billPaymentAmount = billPaymentAmount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getBillCompanyName() {
        return billCompanyName;
    }

    public void setBillCompanyName(String billCompanyName) {
        this.billCompanyName = billCompanyName;
    }

    public String getBillNickname() {
        return billNickname;
    }

    public void setBillNickname(String billNickname) {
        this.billNickname = billNickname;
    }

    public Integer getBillPaymentDay() {
        return billPaymentDay;
    }

    public void setBillPaymentDay(Integer billPaymentDay) {
        this.billPaymentDay = billPaymentDay;
    }

    public BigDecimal getBillPaymentAmount() {
        return billPaymentAmount;
    }

    public void setBillPaymentAmount(BigDecimal billPaymentAmount) {
        this.billPaymentAmount = billPaymentAmount;
    }


}
