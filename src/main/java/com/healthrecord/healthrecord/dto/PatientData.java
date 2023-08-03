package com.healthrecord.healthrecord.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientData {
    private String name;
    private String telephone;
    private LocalDate dateOfBirth;
    private String idNo;
    private String address;
    private String county;
    private String subCounty;
    private String email;
    private String gender;
    private String maritalStatus;
}
