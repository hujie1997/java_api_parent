package com.tedu.cn;

import org.junit.Test;

public class StringBulidTest {
    /**
     * Stringbulider 可变字符串
     */
    @Test
    public void test(){
        StringBuilder build=new StringBuilder();
        build.append("I do't know ");
        build.append("What you say");
        build.append(12000);
        System.out.println(build.toString());
        build.delete(1,6);
        System.out.println(build.toString());
    }
}
