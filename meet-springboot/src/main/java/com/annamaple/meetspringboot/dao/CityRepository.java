package com.annamaple.meetspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.annamaple.meetspringboot.bean.City;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
}
