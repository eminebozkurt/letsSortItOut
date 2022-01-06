package com.sortit.letssortitout.api.controllers;

import com.sortit.letssortitout.business.CityService;
import com.sortit.letssortitout.business.CourseService;
import com.sortit.letssortitout.dataAccess.CountryRepository;
import com.sortit.letssortitout.entities.City;
import com.sortit.letssortitout.entities.Country;
import com.sortit.letssortitout.entities.Course;
import com.sortit.letssortitout.entities.dtos.CityRequest;
import com.sortit.letssortitout.entities.dtos.CourseRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {


    @Autowired
    private CityService cityService;

    private final CourseService courseService;
    private final CountryRepository countryRepository;

    @GetMapping(value = "sayhello")
    public String sayHello(){
        return "Hello User";
    }

    @GetMapping(value = "getcities")
    public List<City> getCities(){
        return cityService.getCities();
    }

    @PostMapping(value="addcity")
    public City addCity(@RequestBody City city){
        return cityService.addOneCity(city);
    }

    @GetMapping(value="getcity")
    public City getByCityName(String cityName){
        return cityService.getByCityName(cityName);
    }

    @PostMapping(value="savecity")
    public City saveCity(@RequestBody CityRequest cityRequest){
        return cityService.saveCity(cityRequest);
    }

    @PostMapping(value="addcourse")
    public Course addCourse(@RequestBody CourseRequest courseRequest){
        return courseService.addCourseWithContents(courseRequest);
    }


    @GetMapping(value="getcountry")
    public Country getCountry(@RequestParam int id){
        return cityService.getCountry(id);
    }

    /*@GetMapping(value="getcountrybyname")
    public List<Country> getCountryByName(@RequestParam String prefix){
        return cityService.getCountryByName(prefix);
    }*/
    @GetMapping("getcountrybyname")
    public List<Country> getCountryByName(@RequestParam String prefix){
        return countryRepository.getByCountryName(prefix);
    }

}
