package com.annamaple.meetspringboot.dao;


import com.annamaple.meetspringboot.bean.City;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * 在内存中实现的city的CRUD
 *
 * @author xionglei
 * @create 2022-05-12 15:38
 */
@Component
public class CityDao {

    private static final Map<Integer, City> DATA_MAP = Collections.synchronizedMap(new HashMap<>(16));
    private static final AtomicInteger integer = new AtomicInteger(0);

    static {
        DATA_MAP.put(integer.get(), new City(integer.getAndIncrement(), "jinZhou", "xxx/xxx/xxx/jinZHou"));
        DATA_MAP.put(integer.get(), new City(integer.getAndIncrement(), "xinZhou", "xxx/xxx/xxx/xinZhou"));
        DATA_MAP.put(integer.get(), new City(integer.getAndIncrement(), "zinZhou", "xxx/xxx/xxx/zinZhou"));
        DATA_MAP.put(integer.get(), new City(integer.getAndIncrement(), "ainZhou", "xxx/xxx/xxx/ainZhou"));
    }

    public List<City> findAll() {
        return new LinkedList<>(DATA_MAP.values());
    }

    public int save(String name, String address) {
        int id = integer.getAndIncrement();
        City city = new City(id, name, address);
        DATA_MAP.put(id, city);
        return id;
    }
}
