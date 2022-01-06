package com.sortit.letssortitout.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityRequest {

    private String cityCode;
    private String cityName;
    private int countryId;





}
