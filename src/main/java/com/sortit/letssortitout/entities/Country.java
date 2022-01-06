package com.sortit.letssortitout.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="countries")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="country_id")
    private int id;

    @NonNull
    @Column(name="country_name")
    private String countryName;


    @NonNull
    private long population;

    @OneToMany
    @JoinColumn(name="country_id")
    @JsonIgnore
    private Set<City> cities;



}
