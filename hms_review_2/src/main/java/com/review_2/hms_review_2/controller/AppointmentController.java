package com.review_2.hms_review_2.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.review_2.hms_review_2.model.Appointment;
import com.review_2.hms_review_2.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<Appointment>> getAppointmentsByPatientId(@PathVariable Long patientId) {
        List<Appointment> appointments = appointmentService.getAppointmentsByPatientId(patientId);
        if (appointments != null && !appointments.isEmpty()) {
            return ResponseEntity.ok(appointments);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) {
        Appointment createdAppointment = appointmentService.createAppointment(appointment);
        if (createdAppointment != null) {
            return new ResponseEntity<>(createdAppointment, HttpStatus.CREATED);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // You can add more controller methods as needed
}
