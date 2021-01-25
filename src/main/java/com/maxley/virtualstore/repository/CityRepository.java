package com.maxley.virtualstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxley.virtualstore.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

}
