package com.healthrecord.healthrecord.controllers;

import com.healthrecord.healthrecord.dto.CreatePatientRequest;
import com.healthrecord.healthrecord.dto.PatientCreateResponse;
import com.healthrecord.healthrecord.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000/")
public class PatientController {

    private final PatientService patientService;

    @PostMapping
    public PatientCreateResponse addPatient(@RequestBody CreatePatientRequest createPatientRequest) {
        return patientService.createPatient(createPatientRequest);
    }
}
