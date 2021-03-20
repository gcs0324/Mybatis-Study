package com.kuang.utils;

import org.junit.Test;
import java.util.UUID;


public class IdUtils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-","").toString();
    }

    @Test
    public void test() {
        System.out.println(IdUtils.getId());
        System.out.println(IdUtils.getId());
        System.out.println(IdUtils.getId());
    }
}
