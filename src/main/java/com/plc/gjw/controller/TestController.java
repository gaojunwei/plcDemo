package com.plc.gjw.controller;

import com.plc.gjw.common.controller.result.BasicResult;
import com.plc.gjw.common.controller.result.SingleResult;
import com.plc.gjw.domain.EplUser;
import com.plc.gjw.service.MerChantService;
import com.plc.gjw.service.UserService;
import org.apache.commons.fileupload.util.LimitedInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/epl/test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Resource
    MerChantService merChantService;
    @Resource
    UserService userService;

    @RequestMapping(value = "datetest")
    public SingleResult dateParamTest(@RequestParam("date_star")String date_start, @RequestParam("date_end") String date_end)
    {
        SingleResult result = new SingleResult(true);
        logger.info("@@@@date 值为："+date_start+" - "+date_end);

        Date startDate = getAppointDate(date_start+" 00:00:00");
        Date endDate = getAppointDate(date_end+" 23:59:59");


        List<EplUser> list = userService.listUserByCon(startDate,endDate);
        result.setData(list);
        return result;
    }
    @RequestMapping(value = "date")
    public BasicResult dateParamTest2(@RequestParam("date")String date)
    {
        BasicResult result = new BasicResult(false);
        logger.info("$$$$date 值为："+date);
        return result;
    }


    public Date getAppointDate(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(dateStr);
            System.out.println(">>>>>>>>>"+date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}