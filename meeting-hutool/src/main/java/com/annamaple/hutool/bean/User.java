package com.annamaple.hutool.bean;

import cn.hutool.core.lang.Console;
import lombok.Data;
import lombok.ToString;

/**
 * @author xionglei
 * @create 2022-05-07 17:26
 */
@Data
@ToString
public class User {

    private String name;
    private Integer age;


    public void show() {
        Console.log("Hello, I`m {}, I`m {} years old. ", name, age);
    }
}
