package com.example.ec.service;

import com.example.ec.domain.DistrictModel;
import com.example.ec.repo.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DistrictService {
    private DistrictRepository distRepo;

    @Autowired
    public DistrictService(DistrictRepository distRepo){
        this.distRepo = distRepo;
    }

    public DistrictModel create(String district, String city) {
        return distRepo.findByDistrict(district).orElse(distRepo.save(new DistrictModel(district)));
    }

    /**
     * Lookup All Districts
     *
     * @return
     */
    public Iterable<DistrictModel> lookup(){
        return distRepo.findAll();
    }


    /**
     * Calculate the number of records in the Database.
     *
     * @return the total.
     */
    public long total() {
        return distRepo.count();
    }
}
