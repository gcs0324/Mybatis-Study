package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//无参构造，get,set,tostring,hashcode,equals
@Data
//有参构造
@AllArgsConstructor
//无参构造
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String password;
}
