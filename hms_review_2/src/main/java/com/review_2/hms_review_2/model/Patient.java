package com.review_2.hms_review_2.model;


import jakarta.persistence.*;

import java.util.*;
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String address;
    private String contactDetails;
    private String currentIllness;
    private String diagnosis;
    private String treatmentPlan;
    private double charges; 
    private double payments; 
    private double outstandingBalance; 

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Appointment> appointments;
    public Patient() {
        super();
    }

    public Patient(Long id, String fullName, String dateOfBirth, String gender, String address, String contactDetails,
            String currentIllness, String diagnosis, String treatmentPlan, double charges, double payments,
            double outstandingBalance, List<Appointment> appointments) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.contactDetails = contactDetails;
        this.currentIllness = currentIllness;
        this.diagnosis = diagnosis;
        this.treatmentPlan = treatmentPlan;
        this.charges = charges;
        this.payments = payments;
        this.outstandingBalance = outstandingBalance;
        this.appointments = appointments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getCurrentIllness() {
        return currentIllness;
    }

    public void setCurrentIllness(String currentIllness) {
        this.currentIllness = currentIllness;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public double getPayments() {
        return payments;
    }

    public void setPayments(double payments) {
        this.payments = payments;
    }

    public double getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(double outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    // Getters and setters
}
