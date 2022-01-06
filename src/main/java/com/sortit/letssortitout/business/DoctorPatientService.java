package com.sortit.letssortitout.business;

import com.sortit.letssortitout.dataAccess.DoctorRepository;
import com.sortit.letssortitout.dataAccess.PatientRepository;
import com.sortit.letssortitout.entities.Doctor;
import com.sortit.letssortitout.entities.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorPatientService {

    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    public Doctor addDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    public Patient addPatient(Patient patient){
        return patientRepository.save(patient);
    }

}
