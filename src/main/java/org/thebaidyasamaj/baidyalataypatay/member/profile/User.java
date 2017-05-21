package org.thebaidyasamaj.baidyalataypatay.member.profile;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by saikatgupta on 5/20/17.
 */
@Entity
public class User {
    private String userName;
    private String companyName;
    private String residentialAddress;
    private String mobileNumber;
    @Id
    private String emailId;
    private String webSiteAdress;
    private String landLine;
    private String panCardNo;
    private String declarationMsg;
    private String paymentMode;
    private String paymentAmountInWords;
    private Integer payAmount;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getWebSiteAdress() {
        return webSiteAdress;
    }

    public void setWebSiteAdress(String webSiteAdress) {
        this.webSiteAdress = webSiteAdress;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getPanCardNo() {
        return panCardNo;
    }

    public void setPanCardNo(String panCardNo) {
        this.panCardNo = panCardNo;
    }

    public String getDeclarationMsg() {
        return declarationMsg;
    }

    public void setDeclarationMsg(String declarationMsg) {
        this.declarationMsg = declarationMsg;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentAmountInWords() {
        return paymentAmountInWords;
    }

    public void setPaymentAmountInWords(String paymentAmountInWords) {
        this.paymentAmountInWords = paymentAmountInWords;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }
}
