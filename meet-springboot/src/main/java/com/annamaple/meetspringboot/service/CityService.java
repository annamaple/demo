package com.annamaple.meetspringboot.service;


import com.annamaple.meetspringboot.bean.City;

import java.util.List;

/**
 * @author xionglei
 * @create 2022-05-12 15:37
 */
public interface CityService {
    
    List<City> findAll();

    int add(String name, String address);
    
    List<City> query();
    
}
