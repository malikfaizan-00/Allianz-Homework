package com.example.ec;

import com.example.ec.domain.CityModel;
import com.example.ec.domain.DistrictModel;
import com.example.ec.repo.CityRepository;
import com.example.ec.repo.DistrictRepository;
import com.example.ec.service.CityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class AllianzhwApplicationTests {
    @Autowired
    private CityRepository cityRepo;

    @Autowired
    private DistrictRepository distRepo;

    @Autowired
    private CityService cityService;
    @Autowired
    private DistrictRepository distService;

    @Test
    public void contextLoads() {
    }


    @Test
    public void givenEntityRepository_whenSaveAndRetreiveEntity_thenOK() {
        // given
        CityModel model = cityService.create("Wien", "Ottakring");;
        // when
        CityModel cityFound = cityRepo.findByCity(model.getCity()).orElse(null);
        // then
        assertNotNull(cityFound);
        assertEquals(cityFound.getCity(), model.getCity());
    }

    @Test
    public void RetreiveCity_thenOK() {
        // when
        CityModel cityFound = cityRepo.findByCity("Wien").orElse(null);
        // then
        assertNotNull(cityFound);
        assertEquals(cityFound.getCity(), "Wien");
    }

    @Test
    public void RetreiveDistrict_thenOK() {
        // when
        DistrictModel found = distRepo.findByDistrict("Penzing").orElse(null);
        // then
        assertNotNull(found);
        assertEquals(found.getDistrict(), "Penzing");
    }
}
