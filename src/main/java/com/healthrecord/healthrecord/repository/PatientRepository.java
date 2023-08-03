package com.healthrecord.healthrecord.repository;

import com.healthrecord.healthrecord.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findByEmailOrTelephoneOrIdNumber(String email, String telephone, String idNo);
}
