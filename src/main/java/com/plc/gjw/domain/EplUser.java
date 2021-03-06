package com.plc.gjw.domain;

import java.util.Date;

public class EplUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.id
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.user_account
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private String userAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.user_type
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private String userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.user_password
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.real_name
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.passwd_effect_time
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private Date passwdEffectTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.passwd_expire_time
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private Date passwdExpireTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.passwd_modify_time
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private Date passwdModifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.relogin_flag
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private String reloginFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.relogin_count
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private String reloginCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.last_login_error_time
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private Date lastLoginErrorTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.password_modify_cycle
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private Integer passwordModifyCycle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.org_code
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private String orgCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.status
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.parent_id
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.operator
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.merchent_id
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private Long merchentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.alias
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private String alias;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.created_date
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private Date createdDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.modified_date
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private Date modifiedDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.operator_id
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private Long operatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column epl_user.password_salt
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    private String passwordSalt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.id
     *
     * @return the value of epl_user.id
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.id
     *
     * @param id the value for epl_user.id
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.user_account
     *
     * @return the value of epl_user.user_account
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.user_account
     *
     * @param userAccount the value for epl_user.user_account
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.user_type
     *
     * @return the value of epl_user.user_type
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.user_type
     *
     * @param userType the value for epl_user.user_type
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.user_password
     *
     * @return the value of epl_user.user_password
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.user_password
     *
     * @param userPassword the value for epl_user.user_password
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.real_name
     *
     * @return the value of epl_user.real_name
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.real_name
     *
     * @param realName the value for epl_user.real_name
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.passwd_effect_time
     *
     * @return the value of epl_user.passwd_effect_time
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public Date getPasswdEffectTime() {
        return passwdEffectTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.passwd_effect_time
     *
     * @param passwdEffectTime the value for epl_user.passwd_effect_time
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setPasswdEffectTime(Date passwdEffectTime) {
        this.passwdEffectTime = passwdEffectTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.passwd_expire_time
     *
     * @return the value of epl_user.passwd_expire_time
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public Date getPasswdExpireTime() {
        return passwdExpireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.passwd_expire_time
     *
     * @param passwdExpireTime the value for epl_user.passwd_expire_time
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setPasswdExpireTime(Date passwdExpireTime) {
        this.passwdExpireTime = passwdExpireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.passwd_modify_time
     *
     * @return the value of epl_user.passwd_modify_time
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public Date getPasswdModifyTime() {
        return passwdModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.passwd_modify_time
     *
     * @param passwdModifyTime the value for epl_user.passwd_modify_time
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setPasswdModifyTime(Date passwdModifyTime) {
        this.passwdModifyTime = passwdModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.relogin_flag
     *
     * @return the value of epl_user.relogin_flag
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public String getReloginFlag() {
        return reloginFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.relogin_flag
     *
     * @param reloginFlag the value for epl_user.relogin_flag
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setReloginFlag(String reloginFlag) {
        this.reloginFlag = reloginFlag == null ? null : reloginFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.relogin_count
     *
     * @return the value of epl_user.relogin_count
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public String getReloginCount() {
        return reloginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.relogin_count
     *
     * @param reloginCount the value for epl_user.relogin_count
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setReloginCount(String reloginCount) {
        this.reloginCount = reloginCount == null ? null : reloginCount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.last_login_error_time
     *
     * @return the value of epl_user.last_login_error_time
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public Date getLastLoginErrorTime() {
        return lastLoginErrorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.last_login_error_time
     *
     * @param lastLoginErrorTime the value for epl_user.last_login_error_time
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setLastLoginErrorTime(Date lastLoginErrorTime) {
        this.lastLoginErrorTime = lastLoginErrorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.password_modify_cycle
     *
     * @return the value of epl_user.password_modify_cycle
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public Integer getPasswordModifyCycle() {
        return passwordModifyCycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.password_modify_cycle
     *
     * @param passwordModifyCycle the value for epl_user.password_modify_cycle
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setPasswordModifyCycle(Integer passwordModifyCycle) {
        this.passwordModifyCycle = passwordModifyCycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.org_code
     *
     * @return the value of epl_user.org_code
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.org_code
     *
     * @param orgCode the value for epl_user.org_code
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.status
     *
     * @return the value of epl_user.status
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.status
     *
     * @param status the value for epl_user.status
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.parent_id
     *
     * @return the value of epl_user.parent_id
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.parent_id
     *
     * @param parentId the value for epl_user.parent_id
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.operator
     *
     * @return the value of epl_user.operator
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.operator
     *
     * @param operator the value for epl_user.operator
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.merchent_id
     *
     * @return the value of epl_user.merchent_id
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public Long getMerchentId() {
        return merchentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.merchent_id
     *
     * @param merchentId the value for epl_user.merchent_id
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setMerchentId(Long merchentId) {
        this.merchentId = merchentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.alias
     *
     * @return the value of epl_user.alias
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public String getAlias() {
        return alias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.alias
     *
     * @param alias the value for epl_user.alias
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.created_date
     *
     * @return the value of epl_user.created_date
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.created_date
     *
     * @param createdDate the value for epl_user.created_date
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.modified_date
     *
     * @return the value of epl_user.modified_date
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.modified_date
     *
     * @param modifiedDate the value for epl_user.modified_date
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.operator_id
     *
     * @return the value of epl_user.operator_id
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public Long getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.operator_id
     *
     * @param operatorId the value for epl_user.operator_id
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column epl_user.password_salt
     *
     * @return the value of epl_user.password_salt
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public String getPasswordSalt() {
        return passwordSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column epl_user.password_salt
     *
     * @param passwordSalt the value for epl_user.password_salt
     *
     * @mbg.generated Mon Jan 01 17:03:29 CST 2018
     */
    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt == null ? null : passwordSalt.trim();
    }
}