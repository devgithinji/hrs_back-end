package com.healthrecord.healthrecord.controllers;

import com.healthrecord.healthrecord.dto.CreatePatientRequest;
import com.healthrecord.healthrecord.dto.PatientCreateResponse;
import com.healthrecord.healthrecord.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @PostMapping
    public PatientCreateResponse addPatient(@RequestBody CreatePatientRequest createPatientRequest) {
        return patientService.createPatient(createPatientRequest);
    }
}
