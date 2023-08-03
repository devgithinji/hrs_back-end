package com.healthrecord.healthrecord.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class NextOfKinData {
    private String name;
    private LocalDate dateOfBirth;
    private String idNo;
    private String gender;
    private String relationship;
    private String telephone;
}
