package com.healthrecord.healthrecord.service;

import com.healthrecord.healthrecord.dto.CreatePatientRequest;
import com.healthrecord.healthrecord.dto.PatientCreateResponse;
import com.healthrecord.healthrecord.model.Patient;
import com.healthrecord.healthrecord.repository.PatientRepository;
import com.healthrecord.healthrecord.util.DataMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final DataMapper dataMapper;
    private final JavaMailSender javaMailSender;

    @Override
    public PatientCreateResponse createPatient(CreatePatientRequest request) {
        Optional<Patient> optionalPatient = patientRepository.findByEmailOrTelephoneOrIdNumber(request.getPatientData().getEmail(),
                request.getPatientData().getTelephone(),
                request.getPatientData().getIdNo());

        if (optionalPatient.isPresent()) throw new RuntimeException("Patient already exists with similar details");

        Patient patient = dataMapper.mapCreatePatientRequestToPatient(request);
        Patient savedPatient = patientRepository.save(patient);

        sendEmail(savedPatient);

        return new PatientCreateResponse(savedPatient.getName(), savedPatient.getRefNo(), "Patient saved successfully");
    }

    private void sendEmail(Patient patient) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(patient.getEmail());
        message.setSubject("New Patient Registration");
        String body = "Hi " + patient.getName() + ", your refNo is: " + patient.getRefNo();
        message.setText(body);
        javaMailSender.send(message);
    }
}
