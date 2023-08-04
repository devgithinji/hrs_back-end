package com.healthrecord.healthrecord.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class NextOfKin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String idNo;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String relationship;
    private String telephone;
    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public NextOfKin(String name,
                     LocalDate dateOfBirth,
                     String idNo,
                     Gender gender,
                     String relationship,
                     String telephone) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idNo = idNo;
        this.gender = gender;
        this.relationship = relationship;
        this.telephone = telephone;
    }
}
