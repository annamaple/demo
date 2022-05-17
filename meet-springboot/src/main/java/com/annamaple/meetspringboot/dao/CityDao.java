package com.annamaple.meetspringboot.dao;

import com.annamaple.meetspringboot.bean.City;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * 在内存中实现的city的CRUD
 *
 * @author xionglei
 * @create 2022-05-12 15:38
 */
@Component
public class CityDao {

    private static final Map<Integer, City> DATA_MAP = Collections.synchronizedMap(new HashMap<>(16));

    public List<City> findAll() {
        return new LinkedList<>(DATA_MAP.values());
    }

    public City save(City city) {
        DATA_MAP.put(city.getId(), city);
        return city;
    }
}
