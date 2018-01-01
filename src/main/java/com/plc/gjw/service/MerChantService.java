package com.plc.gjw.service;

import com.github.pagehelper.Page;
import com.plc.gjw.common.controller.result.BasicResult;
import com.plc.gjw.domain.EplMerchant;
import com.plc.gjw.domain.EplUserMerchant;
import com.plc.gjw.domain.data.MerchantData;

import java.util.Map;

/**
 * 商户service层
 * @Auther gjw
 */
public interface MerChantService {
    /**
     * 自定义条件查询
     * @return:
     * @since: 1.0.0
     * @Author:
     * @Date:
     */
    Page<EplUserMerchant> findByMap(Map<String, Object> map, int pageNum, int pageSize);
    /**
     * 保存商户
     * @param eplMerchant
     * @return
     */
    public int insertMerchant(EplMerchant eplMerchant);
    /**
     * 添加商户及主账号
     * @param merchantData
     * @return
     */
    BasicResult save(MerchantData merchantData);
    /**
     * 根据商户主键修改商户及用户信息
     * @param merchantData
     * @return
     */
    BasicResult updateMerchantAndUser(MerchantData merchantData);
    /**
     * 查询所有商户及商户主账号信息列表
     * @param eplMerchant
     * @return
     */
    int updateByPrimaryKeySelective(EplMerchant eplMerchant);
}
