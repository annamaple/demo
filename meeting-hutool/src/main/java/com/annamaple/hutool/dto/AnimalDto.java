package com.annamaple.hutool.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author xionglei
 * @create 2022-05-07 17:13
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AnimalDto {

    private String name;
    private Integer age;
    private Boolean sex;
    
}
