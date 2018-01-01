package com.plc.gjw.user.dao;

import com.plc.gjw.domain.EplUserMerchant;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface EplUserMerchantDao {

    EplUserMerchant selectByUserAccount(Map<String, String> map);
    /**
     * 分页查询商户及主账号信息
     * @param map
     * @return
     */
    List<EplUserMerchant> selectMerchantUserListByCon(Map<String, Object> map);
}
