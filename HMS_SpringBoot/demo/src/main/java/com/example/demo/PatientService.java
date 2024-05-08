package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Patient> getAllPatientsSortedByName() {
        return patientRepository.findAllByOrderByFullNameAsc();
    }
    public List<Patient> getbysorPatients(String fullName) {
        return patientRepository.findAll(Sort.by(Sort.Direction.ASC, fullName));
    }
    public List<Patient> findPatientsByFullNameOrId(String searchQuery) {
        try {
            Long id = Long.parseLong(searchQuery); 
            return patientRepository.findByFullNameContainingIgnoreCaseOrId(null, id);
        } catch (NumberFormatException e) {
            return patientRepository.findByFullNameContainingIgnoreCaseOrId(searchQuery, null);
        }
    }
    

    public Patient updatePatient(Long id, Patient updatedPatient) {
        Patient patient = patientRepository.findById(id).orElse(null);
        if (patient != null) {
            patient.setFullName(updatedPatient.getFullName());
            patient.setDateOfBirth(updatedPatient.getDateOfBirth());
            patient.setGender(updatedPatient.getGender());
            patient.setAddress(updatedPatient.getAddress());
            patient.setContactDetails(updatedPatient.getContactDetails());
            patient.setCurrentIllness(updatedPatient.getCurrentIllness());
            patient.setDiagnosis(updatedPatient.getDiagnosis());
            patient.setTreatmentPlan(updatedPatient.getTreatmentPlan());
            patient.setPastAppointments(updatedPatient.getPastAppointments());
            patient.setUpcomingAppointments(updatedPatient.getUpcomingAppointments());
            patient.setCharges(updatedPatient.getCharges());
            patient.setPayments(updatedPatient.getPayments());
            patient.setOutstandingBalance(updatedPatient.getOutstandingBalance());
            return patientRepository.save(patient);
        }
        return null; // Patient not found
    }

    public boolean deleteEntityById(Long id) {
        if (patientRepository.existsById(id)) {
            patientRepository.deleteById(id);
            return true; 
        } else {
            return false;
        }
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
