package com.plc.gjw.domain;

import java.util.Date;

public class EplUserMerchant {
    /*用户信息*/
    private Long id;
    private String userAccount;
    private String userType;
    private String userPassword;
    private String realName;
    private Date passwdEffectTime;
    private Date passwdExpireTime;
    private Date passwdModifyTime;
    private String reloginFlag;
    private String reloginCount;
    private Date lastLoginErrorTime;
    private Integer passwordModifyCycle;
    private String orgCode;
    private String status;
    private Long parentId;
    private String createOperator;
    private Long merchentId;
    private String alias;
    private Date createdDate;
    private Date modifiedDate;
    /*商户信息*/
    private String merchantName;
    private String merchantIdentify;
    private String phone;
    private String address;
    private Long channelId;
    private Long typeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getPasswdEffectTime() {
        return passwdEffectTime;
    }

    public void setPasswdEffectTime(Date passwdEffectTime) {
        this.passwdEffectTime = passwdEffectTime;
    }

    public Date getPasswdExpireTime() {
        return passwdExpireTime;
    }

    public void setPasswdExpireTime(Date passwdExpireTime) {
        this.passwdExpireTime = passwdExpireTime;
    }

    public Date getPasswdModifyTime() {
        return passwdModifyTime;
    }

    public void setPasswdModifyTime(Date passwdModifyTime) {
        this.passwdModifyTime = passwdModifyTime;
    }

    public String getReloginFlag() {
        return reloginFlag;
    }

    public void setReloginFlag(String reloginFlag) {
        this.reloginFlag = reloginFlag;
    }

    public String getReloginCount() {
        return reloginCount;
    }

    public void setReloginCount(String reloginCount) {
        this.reloginCount = reloginCount;
    }

    public Date getLastLoginErrorTime() {
        return lastLoginErrorTime;
    }

    public void setLastLoginErrorTime(Date lastLoginErrorTime) {
        this.lastLoginErrorTime = lastLoginErrorTime;
    }

    public Integer getPasswordModifyCycle() {
        return passwordModifyCycle;
    }

    public void setPasswordModifyCycle(Integer passwordModifyCycle) {
        this.passwordModifyCycle = passwordModifyCycle;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator;
    }

    public Long getMerchentId() {
        return merchentId;
    }

    public void setMerchentId(Long merchentId) {
        this.merchentId = merchentId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantIdentify() {
        return merchantIdentify;
    }

    public void setMerchantIdentify(String merchantIdentify) {
        this.merchantIdentify = merchantIdentify;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }
}