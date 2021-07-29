package com.satpos.spring;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@JsonIgnoreProperties({ "hibernateLazyInitializer" })
@Entity
@Table(name = "satellites")
public class SatelliteDAO
{
    @Column
    public String Name_of_Satellite_Alternate_Names;
    @Column
    public String Current_Official_Name_of_Satellite;
    @Column
    public String CountryOrg_of_UN_Registry;
    @Column
    public String Country_of_OperatorOwner;
    @Column
    public String OperatorOwner;
    @Column
    public String Users;
    @Column
    public String Purpose;
    @Column
    public String Detailed_Purpose;
    @Column
    public String Class_of_Orbit;
    @Column
    public String Type_of_Orbit;
    @Column
    public String Longitude_of_GEO_degrees;
    @Column
    public String Eccentricity;
    @Column
    public String Inclination_degrees;
    @Column
    public String Period_minutes;
    @Column
    public String Dry_Mass_kg;
    @Column
    public String Power_watts;
    @Column
    public String Date_of_Launch;
    @Column
    public String Expected_Lifetime_yrs;
    @Column
    public String Contractor;
    @Column
    public String Country_of_Contractor;
    @Column
    public String Launch_Site;
    @Column
    public String Launch_Vehicle;
    @Column
    public String COSPAR_Number;
    @Id
    public int NORAD_Number;
    @Column
    public String Comments;
    @Column
    public String FIELD29;
    @Column
    public String Source_Used_for_Orbital_Data;
    @Column
    public String Source;

    @Column
    public String Perigee_km;
    @Column
    public String Apogee_km;
    @Column(unique = false, nullable = true)
    public Integer Launch_Mass_kg;

    public SatelliteDAO(){}

    public SatelliteDAO(String name_of_Satellite_Alternate_Names, String current_Official_Name_of_Satellite, String countryOrg_of_UN_Registry, String country_of_OperatorOwner, String operatorOwner, String users, String purpose, String detailed_Purpose, String class_of_Orbit, String type_of_Orbit, String longitude_of_GEO_degrees, String eccentricity, String inclination_degrees, String period_minutes, String dry_Mass_kg, String power_watts, String date_of_Launch, String expected_Lifetime_yrs, String contractor, String country_of_Contractor, String launch_Site, String launch_Vehicle, String COSPAR_Number, int NORAD_Number, String comments, String FIELD29, String source_Used_for_Orbital_Data, String source, String perigee_km, String apogee_km, int launch_Mass_kg) {
        Name_of_Satellite_Alternate_Names = name_of_Satellite_Alternate_Names;
        Current_Official_Name_of_Satellite = current_Official_Name_of_Satellite;
        CountryOrg_of_UN_Registry = countryOrg_of_UN_Registry;
        Country_of_OperatorOwner = country_of_OperatorOwner;
        OperatorOwner = operatorOwner;
        Users = users;
        Purpose = purpose;
        Detailed_Purpose = detailed_Purpose;
        Class_of_Orbit = class_of_Orbit;
        Type_of_Orbit = type_of_Orbit;
        Longitude_of_GEO_degrees = longitude_of_GEO_degrees;
        Eccentricity = eccentricity;
        Inclination_degrees = inclination_degrees;
        Period_minutes = period_minutes;
        Dry_Mass_kg = dry_Mass_kg;
        Power_watts = power_watts;
        Date_of_Launch = date_of_Launch;
        Expected_Lifetime_yrs = expected_Lifetime_yrs;
        Contractor = contractor;
        Country_of_Contractor = country_of_Contractor;
        Launch_Site = launch_Site;
        Launch_Vehicle = launch_Vehicle;
        this.COSPAR_Number = COSPAR_Number;
        this.NORAD_Number = NORAD_Number;
        Comments = comments;
        this.FIELD29 = FIELD29;
        Source_Used_for_Orbital_Data = source_Used_for_Orbital_Data;
        Source = source;
        Perigee_km = perigee_km;
        Apogee_km = apogee_km;
        Launch_Mass_kg = launch_Mass_kg;
    }


    public String getName_of_Satellite_Alternate_Names() {
        return Name_of_Satellite_Alternate_Names;
    }

    public void setName_of_Satellite_Alternate_Names(String name_of_Satellite_Alternate_Names) {
        Name_of_Satellite_Alternate_Names = name_of_Satellite_Alternate_Names;
    }

    public String getCurrent_Official_Name_of_Satellite() {
        return Current_Official_Name_of_Satellite;
    }

    public void setCurrent_Official_Name_of_Satellite(String current_Official_Name_of_Satellite) {
        Current_Official_Name_of_Satellite = current_Official_Name_of_Satellite;
    }

    public String getCountryOrg_of_UN_Registry() {
        return CountryOrg_of_UN_Registry;
    }

    public void setCountryOrg_of_UN_Registry(String countryOrg_of_UN_Registry) {
        CountryOrg_of_UN_Registry = countryOrg_of_UN_Registry;
    }

    public String getCountry_of_OperatorOwner() {
        return Country_of_OperatorOwner;
    }

    public void setCountry_of_OperatorOwner(String country_of_OperatorOwner) {
        Country_of_OperatorOwner = country_of_OperatorOwner;
    }

    public String getOperatorOwner() {
        return OperatorOwner;
    }

    public void setOperatorOwner(String operatorOwner) {
        OperatorOwner = operatorOwner;
    }

    public String getUsers() {
        return Users;
    }

    public void setUsers(String users) {
        Users = users;
    }

    public String getPurpose() {
        return Purpose;
    }

    public void setPurpose(String purpose) {
        Purpose = purpose;
    }

    public String getDetailed_Purpose() {
        return Detailed_Purpose;
    }

    public void setDetailed_Purpose(String detailed_Purpose) {
        Detailed_Purpose = detailed_Purpose;
    }

    public String getClass_of_Orbit() {
        return Class_of_Orbit;
    }

    public void setClass_of_Orbit(String class_of_Orbit) {
        Class_of_Orbit = class_of_Orbit;
    }

    public String getType_of_Orbit() {
        return Type_of_Orbit;
    }

    public void setType_of_Orbit(String type_of_Orbit) {
        Type_of_Orbit = type_of_Orbit;
    }

    public String getLongitude_of_GEO_degrees() {
        return Longitude_of_GEO_degrees;
    }

    public void setLongitude_of_GEO_degrees(String longitude_of_GEO_degrees) {
        Longitude_of_GEO_degrees = longitude_of_GEO_degrees;
    }

    public String getEccentricity() {
        return Eccentricity;
    }

    public void setEccentricity(String eccentricity) {
        Eccentricity = eccentricity;
    }

    public String getInclination_degrees() {
        return Inclination_degrees;
    }

    public void setInclination_degrees(String inclination_degrees) {
        Inclination_degrees = inclination_degrees;
    }

    public String getPeriod_minutes() {
        return Period_minutes;
    }

    public void setPeriod_minutes(String period_minutes) {
        Period_minutes = period_minutes;
    }

    public String getDry_Mass_kg() {
        return Dry_Mass_kg;
    }

    public void setDry_Mass_kg(String dry_Mass_kg) {
        Dry_Mass_kg = dry_Mass_kg;
    }

    public String getPower_watts() {
        return Power_watts;
    }

    public void setPower_watts(String power_watts) {
        Power_watts = power_watts;
    }

    public String getDate_of_Launch() {
        return Date_of_Launch;
    }

    public void setDate_of_Launch(String date_of_Launch) {
        Date_of_Launch = date_of_Launch;
    }

    public String getExpected_Lifetime_yrs() {
        return Expected_Lifetime_yrs;
    }

    public void setExpected_Lifetime_yrs(String expected_Lifetime_yrs) {
        Expected_Lifetime_yrs = expected_Lifetime_yrs;
    }

    public String getContractor() {
        return Contractor;
    }

    public void setContractor(String contractor) {
        Contractor = contractor;
    }

    public String getCountry_of_Contractor() {
        return Country_of_Contractor;
    }

    public void setCountry_of_Contractor(String country_of_Contractor) {
        Country_of_Contractor = country_of_Contractor;
    }

    public String getLaunch_Site() {
        return Launch_Site;
    }

    public void setLaunch_Site(String launch_Site) {
        Launch_Site = launch_Site;
    }

    public String getLaunch_Vehicle() {
        return Launch_Vehicle;
    }

    public void setLaunch_Vehicle(String launch_Vehicle) {
        Launch_Vehicle = launch_Vehicle;
    }

    public String getCOSPAR_Number() {
        return COSPAR_Number;
    }

    public void setCOSPAR_Number(String COSPAR_Number) {
        this.COSPAR_Number = COSPAR_Number;
    }

    public int getNORAD_Number() {
        return NORAD_Number;
    }

    public void setNORAD_Number(int NORAD_Number) {
        this.NORAD_Number = NORAD_Number;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public String getFIELD29() {
        return FIELD29;
    }

    public void setFIELD29(String FIELD29) {
        this.FIELD29 = FIELD29;
    }

    public String getSource_Used_for_Orbital_Data() {
        return Source_Used_for_Orbital_Data;
    }

    public void setSource_Used_for_Orbital_Data(String source_Used_for_Orbital_Data) {
        Source_Used_for_Orbital_Data = source_Used_for_Orbital_Data;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getPerigee_km() {
        return Perigee_km;
    }

    public void setPerigee_km(String perigee_km) {
        Perigee_km = perigee_km;
    }

    public String getApogee_km() {
        return Apogee_km;
    }

    public void setApogee_km(String apogee_km) {
        Apogee_km = apogee_km;
    }

    public int getLaunch_Mass_kg() {
        return Launch_Mass_kg;
    }

    public void setLaunch_Mass_kg(int launch_Mass_kg) {
        Launch_Mass_kg = launch_Mass_kg;
    }
}
