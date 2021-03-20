package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;    //属性名与字段名不一致
    private int views;
}
