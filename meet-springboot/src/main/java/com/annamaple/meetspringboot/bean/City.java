package com.annamaple.meetspringboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author xionglei
 * @create 2022-05-12 15:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    
    private Integer id;
    private String name;
    private String address;
}
