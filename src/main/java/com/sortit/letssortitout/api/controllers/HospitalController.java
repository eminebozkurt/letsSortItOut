package com.sortit.letssortitout.api.controllers;

import com.sortit.letssortitout.business.DoctorPatientService;
import com.sortit.letssortitout.entities.Doctor;
import com.sortit.letssortitout.entities.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hospital/")
@RequiredArgsConstructor
public class HospitalController {

    private final DoctorPatientService doctorPatientService;

    @PostMapping("savedoctor")
    public Doctor saveDoctor(@RequestBody Doctor doctor){
        return doctorPatientService.addDoctor(doctor);
    }

    @PostMapping("savepatient")
    public Patient savePatient(@RequestBody Patient patient){
        return doctorPatientService.addPatient(patient);
    }
    
    


}
