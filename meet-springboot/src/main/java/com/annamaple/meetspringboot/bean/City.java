package com.annamaple.meetspringboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.persistence.*;


/**
 * Entity 对应数据库字段结构
 *
 * @author xionglei
 * @create 2022-05-12 15:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "city")
@Entity
public class City {

    @Id
    // id生成策略为id生成器
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
}
