package com.satpos.spring.Controller;

import com.satpos.spring.SatelliteDAO;
import com.satpos.spring.SatelliteRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/satellite/get/norad/{norad}")
    public SatelliteDAO getByNorad(@PathVariable int norad){
        return satRepo.findByNorad(norad);
    }

    @GetMapping("/satellite/get/launch/site")
    public Iterable<String> getAllLaunchSites(){
        return satRepo.getAllLaunchSites();
    }














    @GetMapping("/satellite/get/orbit/{orbit}")
    public Iterable<SatelliteDAO> getByOrbit(@PathVariable String orbit){
        return satRepo.filterSatellitesByOrbit(orbit);
    }
}
