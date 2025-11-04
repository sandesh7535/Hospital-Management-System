package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Patient;
import java.util.List;
import java.util.Optional;

public interface PatientService {
    List<Patient> findAll();
    Optional<Patient> findById(Long id);
    Patient save(Patient patient);
    Patient update(Long id, Patient updatedPatient);
    void deleteById(Long id);
}


