package com.sortit.letssortitout.dataAccess;

import com.sortit.letssortitout.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country,Integer> {
    Country findById(int id);

    @Query("from Country where id=?1")
    Country getById(int id);


    @Query("select c from Country c where c.countryName like :prefix% order by c.population asc")
    List<Country> getByCountryName(String prefix);


    @Query("select c from Country c where c.countryName like :countryName% and c.population >= :population")
    List<Country> getByCnameAndPopulation(@Param("countryName") String countryName, @Param("population")long population);

    @Query("select c.countryName, c.population from Country c where c.countryName like :countryName% and c.population >= :population")
    List<Object[]> getByCnameAndPopulation2(@Param("countryName") String countryName, @Param("population") long population);

    @Query(value = "select c.country_name, c.population from countries c where c.country_name like :countryName% and c.population >= :population", nativeQuery = true)
    List<Object[]> getByCnameAndPopulationNative(@Param("countryName") String countryName, @Param("population")long population);






}
