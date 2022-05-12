package com.annamaple.nutz.sweet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;


/**
 * @author xionglei
 * @create 2022-05-07 16:32
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    
    private String name;
    private Date birthday;
    
}
