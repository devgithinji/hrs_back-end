package com.healthrecord.healthrecord.dto;

import com.healthrecord.healthrecord.model.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class NextOfKinData {
    @NotBlank(message = "name is required")
    private String name;
    @NotNull(message = "date Of Birth is required")
    private LocalDate dateOfBirth;
    @NotBlank(message = "id No is required")
    private String idNo;
    @NotNull(message = "gender is required")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @NotBlank(message = "relationship is required")
    private String relationship;
    @NotBlank(message = "telephone is required")
    private String telephone;

    public void setGender(String gender) {
        this.gender = Gender.valueOf(gender.toUpperCase());
    }
}
