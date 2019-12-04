package com.tedu.cn;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdate {
    @Test
    /**
     * 日期转字符串
     */
    public void test1(){
        Date nowTime=new Date();
        System.out.println(nowTime);
        SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(time.format(nowTime));
    }
    @Test
    /**
     * 字符串转日期
     */
    public void test2() throws ParseException {
        String date="2019-12-04";
        SimpleDateFormat dtf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dtf.parse(date));
    }

}


