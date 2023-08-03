package com.healthrecord.healthrecord.dto;

import lombok.Data;

@Data
public class CreatePatientRequest {
    private PatientData patientData;
    private NextOfKinData nextOfKinData;
}
