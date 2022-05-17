package com.annamaple.meetspringboot.service.impl;

import com.annamaple.meetspringboot.bean.City;
import com.annamaple.meetspringboot.dao.CityRepository;
import com.annamaple.meetspringboot.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * 保存到数据库
 *
 * @author xionglei
 * @create 2022-05-16 14:52
 */
@Service
public class PersistenceCityServiceImpl implements CityService {

    private static final AtomicInteger ATOMIC_INTEGER = new AtomicInteger(0);

    private final CityRepository cityRepository;

    public PersistenceCityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public int add(String name, String address) {
        City city = new City();
        city.setName(name);
        city.setAddress(address);
        city.setId(ATOMIC_INTEGER.getAndIncrement());
        return cityRepository.save(city).getId();
    }

}
