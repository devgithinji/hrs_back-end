package com.healthrecord.healthrecord.dto;

import jakarta.validation.Valid;
import lombok.Data;

@Data
public class CreatePatientRequest {
    @Valid
    private PatientData patientData;
    @Valid
    private NextOfKinData nextOfKinData;
}
