package com.review_2.hms_review_2.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable; // Correct import
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review_2.hms_review_2.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    Page<Patient> findAll(Pageable pageable);
    List<Patient> findByFullNameContainingIgnoreCase(String fullName);
}
