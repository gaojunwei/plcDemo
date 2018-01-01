package com.plc.gjw.domain.data;

import java.math.BigDecimal;

public class MerchantData {

    private long merchantId;//商户ID

    private String merchantName;//商户名称
    private String merchantShorthand;//商户简称

    private String userAccount;//商户账号
    private String userPassword;//商户账号密码

    private String ifOpenQrcode;//是否开启二维码（on:开启，off:关闭；）
    private String qrcodeType;//二维码类型(static：静态地址、dynamic：动态地址、scart：购物车地址)
    private String qrcodeUrl;//商户二维码内容的值

    private String address;//商户详细地址

    private BigDecimal merchantLong;//商家经度值
    private BigDecimal merchantLatitude;//商家纬度值

    private String merchantLogo;//商户的logo图片
    private String merchantBanner;//商户的banner图片

    private String ifOpenErp;//是否开启erp（on:开启，off:关闭；）
    private String merchantSecretkey;//商户支付产品密钥

    private Long createManId;;//操作人id
    private String createMan;//操作人名称

    @Override
    public String toString() {
        return "MerchantData{" +
                "merchantId='" + merchantId + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", merchantShorthand='" + merchantShorthand + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", ifOpenQrcode='" + ifOpenQrcode + '\'' +
                ", qrcodeType='" + qrcodeType + '\'' +
                ", qrcodeUrl='" + qrcodeUrl + '\'' +
                ", address='" + address + '\'' +
                ", merchantLong=" + merchantLong +
                ", merchantLatitude=" + merchantLatitude +
                ", merchantLogo='" + merchantLogo + '\'' +
                ", merchantBanner='" + merchantBanner + '\'' +
                ", ifOpenErp='" + ifOpenErp + '\'' +
                ", merchantSecretkey='" + merchantSecretkey + '\'' +
                ", createManId=" + createManId +
                ", createMan='" + createMan + '\'' +
                '}';
    }

    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public Long getCreateManId() {
        return createManId;
    }

    public void setCreateManId(Long createManId) {
        this.createManId = createManId;
    }

    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantShorthand() {
        return merchantShorthand;
    }

    public void setMerchantShorthand(String merchantShorthand) {
        this.merchantShorthand = merchantShorthand;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getIfOpenQrcode() {
        return ifOpenQrcode;
    }

    public void setIfOpenQrcode(String ifOpenQrcode) {
        this.ifOpenQrcode = ifOpenQrcode;
    }

    public String getQrcodeType() {
        return qrcodeType;
    }

    public void setQrcodeType(String qrcodeType) {
        this.qrcodeType = qrcodeType;
    }

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getMerchantLong() {
        return merchantLong;
    }

    public void setMerchantLong(BigDecimal merchantLong) {
        this.merchantLong = merchantLong;
    }

    public BigDecimal getMerchantLatitude() {
        return merchantLatitude;
    }

    public void setMerchantLatitude(BigDecimal merchantLatitude) {
        this.merchantLatitude = merchantLatitude;
    }

    public String getMerchantLogo() {
        return merchantLogo;
    }

    public void setMerchantLogo(String merchantLogo) {
        this.merchantLogo = merchantLogo;
    }

    public String getMerchantBanner() {
        return merchantBanner;
    }

    public void setMerchantBanner(String merchantBanner) {
        this.merchantBanner = merchantBanner;
    }

    public String getIfOpenErp() {
        return ifOpenErp;
    }

    public void setIfOpenErp(String ifOpenErp) {
        this.ifOpenErp = ifOpenErp;
    }

    public String getMerchantSecretkey() {
        return merchantSecretkey;
    }

    public void setMerchantSecretkey(String merchantSecretkey) {
        this.merchantSecretkey = merchantSecretkey;
    }
}
