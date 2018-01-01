package com.plc.gjw.domain;

import java.util.Date;

public class StockRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.id
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.merchant_id
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private Long merchantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.product_id
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.reduce_no
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private String reduceNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.out_count
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private Integer outCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.in_count
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private Integer inCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.source
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.record_type
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private String recordType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.remark
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.operator
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.operator_id
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private Long operatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.created_date
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private Date createdDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innovation_stock_record.modified_date
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    private Date modifiedDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.id
     *
     * @return the value of innovation_stock_record.id
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.id
     *
     * @param id the value for innovation_stock_record.id
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.merchant_id
     *
     * @return the value of innovation_stock_record.merchant_id
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public Long getMerchantId() {
        return merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.merchant_id
     *
     * @param merchantId the value for innovation_stock_record.merchant_id
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.product_id
     *
     * @return the value of innovation_stock_record.product_id
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.product_id
     *
     * @param productId the value for innovation_stock_record.product_id
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.reduce_no
     *
     * @return the value of innovation_stock_record.reduce_no
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public String getReduceNo() {
        return reduceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.reduce_no
     *
     * @param reduceNo the value for innovation_stock_record.reduce_no
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setReduceNo(String reduceNo) {
        this.reduceNo = reduceNo == null ? null : reduceNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.out_count
     *
     * @return the value of innovation_stock_record.out_count
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public Integer getOutCount() {
        return outCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.out_count
     *
     * @param outCount the value for innovation_stock_record.out_count
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setOutCount(Integer outCount) {
        this.outCount = outCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.in_count
     *
     * @return the value of innovation_stock_record.in_count
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public Integer getInCount() {
        return inCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.in_count
     *
     * @param inCount the value for innovation_stock_record.in_count
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setInCount(Integer inCount) {
        this.inCount = inCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.source
     *
     * @return the value of innovation_stock_record.source
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.source
     *
     * @param source the value for innovation_stock_record.source
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.record_type
     *
     * @return the value of innovation_stock_record.record_type
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.record_type
     *
     * @param recordType the value for innovation_stock_record.record_type
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.remark
     *
     * @return the value of innovation_stock_record.remark
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.remark
     *
     * @param remark the value for innovation_stock_record.remark
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.operator
     *
     * @return the value of innovation_stock_record.operator
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.operator
     *
     * @param operator the value for innovation_stock_record.operator
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.operator_id
     *
     * @return the value of innovation_stock_record.operator_id
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public Long getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.operator_id
     *
     * @param operatorId the value for innovation_stock_record.operator_id
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.created_date
     *
     * @return the value of innovation_stock_record.created_date
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.created_date
     *
     * @param createdDate the value for innovation_stock_record.created_date
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innovation_stock_record.modified_date
     *
     * @return the value of innovation_stock_record.modified_date
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innovation_stock_record.modified_date
     *
     * @param modifiedDate the value for innovation_stock_record.modified_date
     *
     * @mbg.generated Mon Jan 01 19:25:08 CST 2018
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}