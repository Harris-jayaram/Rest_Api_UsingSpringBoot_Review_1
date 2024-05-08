package com.review_2.hms_review_2.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime appointmentDateTime;
    private String appointmentReason;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    public Appointment(){
        super();
    }
    public Appointment(Long id, LocalDateTime appointmentDateTime, String appointmentReason, Patient patient) {
        this.id = id;
        this.appointmentDateTime = appointmentDateTime;
        this.appointmentReason = appointmentReason;
        this.patient = patient;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }
    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }
    public String getAppointmentReason() {
        return appointmentReason;
    }
    public void setAppointmentReason(String appointmentReason) {
        this.appointmentReason = appointmentReason;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    // Getters and setters
}
