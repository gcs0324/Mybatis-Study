package com.kuang.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Bolg {
    private String id;
    private String title;
    private String auther;
    private Date createTime;
    private int views;
}
