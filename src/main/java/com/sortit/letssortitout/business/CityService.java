package com.sortit.letssortitout.business;

import com.sortit.letssortitout.dataAccess.CityRepository;
import com.sortit.letssortitout.dataAccess.CountryRepository;
import com.sortit.letssortitout.entities.City;
import com.sortit.letssortitout.entities.Country;
import com.sortit.letssortitout.entities.dtos.CityRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityService {

    private final CityRepository cityRepository;
    private final CountryRepository countryRepository;

    public List<City> getCities(){
        return cityRepository.findAll();
    }


    public City addOneCity(City city) {
        return cityRepository.save(city);
    }

    public City getByCityName(String cityName){
        return cityRepository.getByCityName(cityName);
    }

    public City saveCity(CityRequest cityRequest) {
        Country country = countryRepository.findById(cityRequest.getCountryId());
        City city = new City(null,cityRequest.getCityName(),cityRequest.getCityCode(),country);
        return cityRepository.save(city);

    }


    public Country getCountry(int id) {
        return countryRepository.getById(id);
    }

    public List<Country> getCountryByName(String prefix) {
        return countryRepository.getByCountryName(prefix);
    }


}
