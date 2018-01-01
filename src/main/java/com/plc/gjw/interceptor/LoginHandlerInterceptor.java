package com.plc.gjw.interceptor;

import com.alibaba.druid.support.json.JSONParser;
import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.plc.gjw.common.controller.result.BasicResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 登录拦截器
 * @author gjw
 * @create 2017-11-14 15:50
 **/
public class LoginHandlerInterceptor extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(LoginHandlerInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String path = request.getServletPath();
        logger.info("拦截的请求路径："+path);
        HttpSession session = request.getSession();
        if(session.getAttribute("commonUserInfo")==null)
        {
            //未登录状态，拦截并返回信息描述
            BasicResult basicResult = new BasicResult(false);
            basicResult.setReturnCode("100");
            basicResult.setReturnMessage("尚未登录不能进行此操作");

            PrintWriter writer = null;
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json;charset=UTF-8");
            try {
                writer = response.getWriter();
                String jsonStr = JSON.toJSONString(basicResult);
                System.out.println(jsonStr);
                writer.print(jsonStr);
            } catch (IOException e) {
                logger.error(e.getMessage(),e);
            } finally {
                if (writer != null){
                    writer.close();
                }
            }
            logger.info("用户未登录:"+path);
            return false;
        }
        logger.info("用户已登录:"+path);
        return true;
    }
}
