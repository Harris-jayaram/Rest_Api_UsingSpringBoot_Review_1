package com.review_2.hms_review_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable; // Correct import
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.review_2.hms_review_2.model.Patient;
import com.review_2.hms_review_2.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.createPatient(patient);
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    @GetMapping("/all")
    public Page<Patient> getAllPatients(Pageable pageable) {
        return patientService.getAllPatients(pageable);
    }

    @GetMapping("/search/{query}")
    public List<Patient> searchPatientsByFullName(@PathVariable String query) {
        return patientService.searchPatientsByFullName(query);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient updatedPatient) {
        return patientService.updatePatient(id, updatedPatient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatientById(@PathVariable Long id) {
        if (patientService.deletePatientById(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
