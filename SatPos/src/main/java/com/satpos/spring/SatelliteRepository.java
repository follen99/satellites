package com.satpos.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SatelliteRepository extends JpaRepository<SatelliteDAO, Integer> {

    @Query("from SatelliteDAO s where s.Class_of_Orbit = ?1")
    public Iterable<SatelliteDAO> filterSatellitesByOrbit(String orbit);

    @Query("from SatelliteDAO s where s.NORAD_Number = ?1")
    public SatelliteDAO findByNorad(int norad);

    @Query("from SatelliteDAO")
    public Iterable<SatelliteDAO> getAllTest();

    @Query("select Launch_Site from SatelliteDAO")
    public Iterable<String> getAllLaunchSites();

    @Query("select Launch_Vehicle from SatelliteDAO")
    public Iterable<String> getAllLaunchVehicles();

    /**
     @Query("UPDATE UserDAO u SET u.loginAttempts = ?1 where u.username = ?2")
     void updateUserLoginAttempts(int attempts, String username);
     * 	*/
}
