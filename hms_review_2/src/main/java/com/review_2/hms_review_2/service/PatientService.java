package com.review_2.hms_review_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable; // Correct import
import org.springframework.stereotype.Service;

import com.review_2.hms_review_2.model.Patient;
import com.review_2.hms_review_2.repository.PatientRepository;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    public Page<Patient> getAllPatients(Pageable pageable) {
        return patientRepository.findAll(pageable);
    }

    public List<Patient> searchPatientsByFullName(String fullName) {
        return patientRepository.findByFullNameContainingIgnoreCase(fullName);
    }

    public Patient updatePatient(Long id, Patient updatedPatient) {
        Patient patient = patientRepository.findById(id).orElse(null);
        if (patient != null) {
            // Update patient details
            return patientRepository.save(patient);
        }
        return null; // Patient not found
    }

    public boolean deletePatientById(Long id) {
        if (patientRepository.existsById(id)) {
            patientRepository.deleteById(id);
            return true; 
        } else {
            return false;
        }
    }
}
