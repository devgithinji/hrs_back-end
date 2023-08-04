package com.healthrecord.healthrecord.dto;

import com.healthrecord.healthrecord.model.Gender;
import com.healthrecord.healthrecord.model.MaritalStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientData {
    @NotBlank(message = "name is required")
    private String name;
    @NotBlank(message = "telephone is required")
    private String telephone;
    @NotNull(message = "date Of Birth is required")
    private LocalDate dateOfBirth;
    @NotBlank(message = "id Number is required")
    private String idNo;
    @NotBlank(message = "address is required")
    private String address;
    @NotBlank(message = "county is required")
    private String county;
    @NotBlank(message = "subCounty is required")
    private String subCounty;
    @NotBlank(message = "email is required")
    private String email;
    @NotNull(message = "gender is required")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @NotNull(message = "maritalStatus is required")
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

    public void setGender(String gender) {
        this.gender = Gender.valueOf(gender.toUpperCase());
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = MaritalStatus.valueOf(maritalStatus.toUpperCase());
    }
}
