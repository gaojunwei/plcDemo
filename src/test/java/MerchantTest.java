import com.alibaba.fastjson.JSON;
import com.plc.gjw.common.controller.result.BasicResult;
import com.plc.gjw.common.controller.result.PageResult;
import com.plc.gjw.controller.MerchantController;
import com.plc.gjw.domain.data.MerchantData;
import com.plc.gjw.user.dao.EplUserDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring/applicationContext.xml","/spring-mvc.xml"})
public class MerchantTest {

    @Resource
    MerchantController merchantController;

    MerchantData merchantData;
    //初始化HSP对象
    @Before
    public void inint(){
        merchantData = new MerchantData();
        merchantData.setMerchantId(2);
        merchantData.setMerchantName("兴隆天下");//商户名称
        merchantData.setMerchantShorthand("兴隆");//商户简称

        merchantData.setUserAccount("zhaoliu");//商户账号
        merchantData.setUserPassword("123456");//商户账号密码

        merchantData.setIfOpenQrcode("off");//是否开启二维码（on:开启，off:关闭；）
        merchantData.setQrcodeType("static");//二维码类型(static：静态地址、dynamic：动态地址、scart：购物车地址)
        merchantData.setQrcodeUrl("http://jdr.jd.com");//商户二维码内容的值

        merchantData.setAddress("河北天下第一村");//商户详细地址

        BigDecimal b1 = new BigDecimal("3.222145452");
        BigDecimal b2 = new BigDecimal("3.222145452");
        merchantData.setMerchantLong(b1);//商家经度值
        merchantData.setMerchantLatitude(b2);//商家纬度值

        merchantData.setMerchantLogo("2_1712_5_231");//商户的logo图片
        merchantData.setMerchantBanner("1_1712_5_278");//商户的banner图片

        merchantData.setIfOpenErp("on");//是否开启erp（on:开启，off:关闭；）
        merchantData.setMerchantSecretkey("");//商户支付产品密钥

        merchantData.setCreateMan("gjw");//操作人名称
        long id = 101;
        merchantData.setCreateManId(id);
    }
    //查询商户
    @Test
    public void test001(){
        PageResult pageResult = merchantController.list(1,20);
        System.out.println("处理结果："+ JSON.toJSONString(pageResult));
    }
    //添加商户
    @Test
    public void test002(){
        BasicResult b = merchantController.save(merchantData);
        System.out.println("处理结果："+ JSON.toJSONString(b));
    }
    //修改商户
    @Test
    public void test003(){
        BasicResult b = merchantController.modify(merchantData);
        System.out.println("处理结果："+ JSON.toJSONString(b));
    }
}
