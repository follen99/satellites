package com.satpos.spring.Controller;

import com.satpos.spring.SatelliteDAO;
import com.satpos.spring.SatelliteRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController


public class SatelliteController {
    private final SatelliteRepository satRepo;

    public SatelliteController(SatelliteRepository satRepo) {
        this.satRepo = satRepo;
    }

    @GetMapping("/satellite/get/all")
    public Iterable<SatelliteDAO> getAll(){
        return satRepo.findAll();
    }
}
