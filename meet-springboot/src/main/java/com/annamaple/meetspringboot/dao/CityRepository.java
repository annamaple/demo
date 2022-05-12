package com.annamaple.meetspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.annamaple.meetspringboot.bean.City;

@Component
public interface CityRepository extends JpaRepository<City, Integer> {
	
}
