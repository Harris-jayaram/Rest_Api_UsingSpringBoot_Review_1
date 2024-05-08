package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pat")
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
    public List<Patient> getAllPatientsSortedByName() {
        return patientService.getAllPatientsSortedByName();
    }
    @GetMapping("/search/{query}")
    public List<Patient> searchPatientsByFullNameOrId(@PathVariable String query) {
        return patientService.findPatientsByFullNameOrId(query);
    }
    @GetMapping("/sort/{fullName}")
    public ResponseEntity<List<Patient>> get(@PathVariable String fullName) {
        return ResponseEntity.ok(patientService.getbysorPatients(fullName));
    }
    

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient updatedPatient) {
        return patientService.updatePatient(id, updatedPatient);
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }
    @DeleteMapping("/{id}")
    public void deleteEntityById(@PathVariable Long id) {
        patientService.deleteEntityById(id);
    }

}
