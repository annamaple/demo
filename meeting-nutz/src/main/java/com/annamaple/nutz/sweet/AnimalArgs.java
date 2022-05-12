package com.annamaple.nutz.sweet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author xionglei
 * @create 2022-05-07 16:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AnimalArgs {
    
    private String name;
    private Integer age;
}
