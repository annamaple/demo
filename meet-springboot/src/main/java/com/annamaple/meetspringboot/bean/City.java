package com.annamaple.meetspringboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * @author xionglei
 * @create 2022-05-12 15:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class City {
    @Id
    private Integer id;
    private String name;
    private String address;
}
