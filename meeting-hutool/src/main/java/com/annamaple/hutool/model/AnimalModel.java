package com.annamaple.hutool.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author xionglei
 * @create 2022-05-07 17:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AnimalModel {

    private String name;
    private Integer age;
    private Boolean sex;
    private SystemModel systemModel;
}
