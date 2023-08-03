package com.healthrecord.healthrecord.service;

import com.healthrecord.healthrecord.dto.CreatePatientRequest;
import com.healthrecord.healthrecord.dto.PatientCreateResponse;

public interface PatientService {
    PatientCreateResponse createPatient(CreatePatientRequest request);
}
