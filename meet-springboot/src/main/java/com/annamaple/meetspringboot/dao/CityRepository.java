package com.annamaple.meetspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.annamaple.meetspringboot.bean.City;

/**
 * 实现JPA的一个借口，不需要加@Repostory注解
 */
public interface CityRepository extends JpaRepository<City, Integer> {

}
