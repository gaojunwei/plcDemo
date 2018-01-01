package com.plc.gjw.common.enums;

public enum MerchantResultEnum {

    MERCHANT_ADD_SUCCESS("100","商户添加成功"),
    MERCHANT_UPDATE_SUCCESS("100","商户信息修改成功"),
    FILE_UPLOAD_SUCCESS("100","文件上传成功"),

    MERCHANT_UPDATE_BLANK_ERROR("-901","必要参数为空，操作失败"),
    MERCHANT_ADD_USER_EXIST_ERROR("-902","商户已经存在，操作失败"),

    DATA_EXIST("101","数据已存在，操作失败"),
    OTHER_EXCEPTION("102","位置错误"),

    MERCHANT_UPDATE_FAIL("-902","更新失败，请重试");

    private String code;
    private String msg;

    MerchantResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
