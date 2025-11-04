package com.hospitalmanagement.service;

import com.hospitalmanagement.entity.Patient;
import com.hospitalmanagement.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    @Override
    public Optional<Patient> findById(Long id) {
        return patientRepository.findById(id);
    }

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient update(Long id, Patient updatedPatient) {
        return patientRepository.findById(id)
                .map(existing -> {
                    existing.setFirstName(updatedPatient.getFirstName());
                    existing.setLastName(updatedPatient.getLastName());
                    existing.setAge(updatedPatient.getAge());
                    existing.setGender(updatedPatient.getGender());
                    existing.setContactNumber(updatedPatient.getContactNumber());
                    existing.setDiagnosis(updatedPatient.getDiagnosis());
                    existing.setAdmissionDate(updatedPatient.getAdmissionDate());
                    return patientRepository.save(existing);
                })
                .orElseThrow(() -> new IllegalArgumentException("Patient not found with id: " + id));
    }

    @Override
    public void deleteById(Long id) {
        patientRepository.deleteById(id);
    }
}


