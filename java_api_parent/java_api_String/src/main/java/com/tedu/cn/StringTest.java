package com.tedu.cn;

public class StringTest {
    @org.junit.Test
    /**
     * contains  判断是否含有字符串的子序列，返回值为boolean
     */
    public void test1(){
        String str="good morning";
        boolean k=str.contains("good");
        System.out.println(k);
    }
    @org.junit.Test
    /**
     * 小写转化为大写
     */
    public void test2(){
        String str1="acbdhk";
        System.out.println(str1.toUpperCase());
    }
    @org.junit.Test
    /**
     * 将字符串转化为byte
     */
    public void test3(){
        String str="I am your father";
        byte no[]=str.getBytes();
        for (int i = 0; i <no.length ; i++) {
            System.out.println(no[i]);
        }
    }
    @org.junit.Test
    public void test4(){
        String str="Can i help you";
        String sr="help you";
        String str1=str.substring(str.indexOf("h"),str.lastIndexOf(sr)+sr.length());
        System.out.println(str1);
        System.out.println(str.substring(4,11));
    }

}
