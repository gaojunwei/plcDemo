import com.alibaba.fastjson.JSON;
import com.plc.gjw.common.controller.result.BasicResult;
import com.plc.gjw.common.exception.AppException;
import com.plc.gjw.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml","/spring-mvc.xml"})
public class JustTest {

    @Resource
    TestService testService;

    @Test
    public void test001(){

//        String userName = "娃哈哈2";
//        String merchantName = "快快快商户2";
//        BasicResult result = new BasicResult(false);
//        try {
//            result = testService.justTest(userName,merchantName,Long.valueOf(100));
//        }catch (Exception e){
//            if(e instanceof AppException)
//            {
//                result.setReturnCode(((AppException)e).getKey());
//                result.setReturnMessage(((AppException)e).getInfo());
//            }else{
//                result.setReturnCode("99999");
//                result.setReturnMessage("操作异常");
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println("处理结果："+ JSON.toJSONString(result));
    }

}
