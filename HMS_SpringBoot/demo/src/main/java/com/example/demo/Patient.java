package com.example.demo;

import jakarta.persistence.*;


@Entity
@Table(name = "patient")
public class Patient {
    @Id
    private Long id;
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String address;
    private String contactDetails;
    private String currentIllness;
    private String diagnosis;
    private String treatmentPlan;
    private String pastAppointments; 
    private String upcomingAppointments;
    private double charges; 
    private double payments; 
    private double outstandingBalance; 

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

    public String getPastAppointments() {
        return pastAppointments;
    }

    public void setPastAppointments(String pastAppointments) {
        this.pastAppointments = pastAppointments;
    }

    public String getUpcomingAppointments() {
        return upcomingAppointments;
    }

    public void setUpcomingAppointments(String upcomingAppointments) {
        this.upcomingAppointments = upcomingAppointments;
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
}
