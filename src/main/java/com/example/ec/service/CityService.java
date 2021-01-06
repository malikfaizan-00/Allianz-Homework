package com.example.ec.service;

import com.example.ec.domain.CityModel;
import com.example.ec.domain.DistrictModel;
import com.example.ec.repo.CityRepository;
import com.example.ec.repo.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CityService {
    private CityRepository cityRepo;
    private DistrictRepository distRepo;

    @Autowired
    public CityService(CityRepository cityRepo, DistrictRepository distRepo){
        this.cityRepo = cityRepo;
        this.distRepo = distRepo;
    }

    public CityModel create(String district, String city) {

//        DistrictModel dist = distRepo.findByDistrict(district).orElseThrow(()->
//                new RuntimeException("Tour package does not exist: " + district));

        return cityRepo.findByCity(city).orElse(cityRepo.save(new CityModel(new Date(), new DistrictModel(district), city)));
    }

    /**
     * Lookup All Cities
     *
     * @return
     */
    public Iterable<CityModel> lookup(){
        return cityRepo.findAll();
    }


    /**
     * Calculate the number of records in the Database.
     *
     * @return the total.
     */
    public long total() {
        return cityRepo.count();
    }
}
