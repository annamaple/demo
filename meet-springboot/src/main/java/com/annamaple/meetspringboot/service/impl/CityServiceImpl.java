package com.annamaple.meetspringboot.service.impl;

import com.annamaple.meetspringboot.bean.City;
import com.annamaple.meetspringboot.dao.CityDao;
import com.annamaple.meetspringboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xionglei
 * @create 2022-05-12 15:38
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;
    
    @Override
    public List<City> findAll() {
        return cityDao.findAll();
    }

    @Override
    public int add(String name, String address) {
        return cityDao.save(name, address);
    }
}
