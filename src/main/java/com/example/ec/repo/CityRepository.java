package com.example.ec.repo;

import com.example.ec.domain.CityModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CityRepository extends CrudRepository<CityModel, String> {
    Optional<CityModel>  findByCity(@Param("city")String city);
}
