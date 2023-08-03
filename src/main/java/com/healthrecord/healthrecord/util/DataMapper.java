package com.healthrecord.healthrecord.util;

import com.healthrecord.healthrecord.dto.CreatePatientRequest;
import com.healthrecord.healthrecord.dto.NextOfKinData;
import com.healthrecord.healthrecord.dto.PatientData;
import com.healthrecord.healthrecord.model.NextOfKin;
import com.healthrecord.healthrecord.model.Patient;
import org.springframework.stereotype.Component;

@Component
public class DataMapper {

    public Patient mapCreatePatientRequestToPatient(CreatePatientRequest createPatientRequest) {
        PatientData patientData = createPatientRequest.getPatientData();
        NextOfKinData nextOfKinData = createPatientRequest.getNextOfKinData();
        Patient patient = new Patient(
                PatientRefNoGenerator.generatePatientRefNo(),
                patientData.getName(),
                patientData.getDateOfBirth(),
                patientData.getIdNo(),
                patientData.getAddress(),
                patientData.getCounty(),
                patientData.getSubCounty(),
                patientData.getTelephone(),
                patientData.getEmail(),
                patientData.getGender(),
                patientData.getMaritalStatus());

        NextOfKin nextOfKin = new NextOfKin(
                nextOfKinData.getName(),
                nextOfKinData.getDateOfBirth(),
                nextOfKinData.getIdNo(),
                nextOfKinData.getGender(),
                nextOfKinData.getRelationship(),
                nextOfKinData.getTelephone());

        patient.setNextOfKin(nextOfKin);
        nextOfKin.setPatient(patient);

        return patient;

    }


}
