package com.sortit.letssortitout.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cities")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private long id;

    @Transient
    private String beanId;

    @Column(length = 30)
    private String cityName;

    @Column(name="citycode",columnDefinition = "character varying(3) not null default 'NA'")
    private String cityCode;

    @Column(name="country_id")
    private int countryId;

    @ManyToOne
    @JoinColumn(name="country_id",insertable = false,updatable = false)
    private Country country;

    public City(String beanId, String cityName, String cityCode, Country country) {
        this.beanId = beanId;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.country = country;
    }
}