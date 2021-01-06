package com.example.ec.repo;

import com.example.ec.domain.DistrictModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface DistrictRepository extends CrudRepository<DistrictModel, String> {
    Optional<DistrictModel> findByDistrict(@Param("district")String district);
}
