package com.annamaple.meetspringboot.service.impl;

import com.annamaple.meetspringboot.bean.City;
import com.annamaple.meetspringboot.dao.CityDao;
import com.annamaple.meetspringboot.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * 保存到内存中
 *
 * @author xionglei
 * @create 2022-05-12 15:38
 */
@Service
public class CatchCityServiceImpl implements CityService {

    private static final AtomicInteger ATOMIC_INTEGER = new AtomicInteger(0);

    private final CityDao cityDao;

    public CatchCityServiceImpl(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public List<City> findAll() {
        return cityDao.findAll();
    }

    @Override
    public int add(String name, String address) {
        City c = new City();
        c.setName(name);
        c.setAddress(address);
        c.setId(ATOMIC_INTEGER.getAndIncrement());
        return cityDao.save(c).getId();
    }

    @Override
    public boolean remove(Integer id) {
        return cityDao.delete(id);
    }

    @Override
    public boolean update(City city) {
        return cityDao.update(city);
    }

}
