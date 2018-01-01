package com.plc.gjw.common.enums;

/**
 * Created by weibin on 2017/11/08.
 */
public enum InnerErrorCode {
    /****************************************************************************
     *
     ***************************************************************************/
    /**
     * 处理成功
     */
    TRX_SUCCESS("000000"),

    /**
     * 调用rpc查询SKU异常
     */
    EPL_SKU_FAIL("000001"),
    /**
     * 调用rpc查询商品信息异常
     */
    EPL_PRODUCT_FAIL("000002"),
    /**
     * 调用rpc查询商品价格异常
     */
    EPL_PRINCE_FAIL("000003"),

    /**
     * 商品库存在商品
     */
    EPL_PRODUCT_EXIST("000004"),

    /**
     * 数据重复
     */
    DATA_EXIST("000004"),
    /**
     * epl系统异常
     */
    EPL_TRADE_FAIL("999999"),
    /****************************************************************************
     * 用户管理返回码定义，1 开头
     ****************************************************************************/
    /**
     * 操作失败
     */
    USER_SAVE_FAIL("100009"),
    ;

    private String value;

    private InnerErrorCode(String value) { this.value = value; }

    public String getValue() { return value;
    }
}
