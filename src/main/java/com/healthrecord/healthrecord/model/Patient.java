package com.healthrecord.healthrecord.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refNo;
    private String name;
    private LocalDate dateOfBirth;
    private String idNumber;
    private String address;
    private String county;
    private String subCounty;
    private String telephone;
    private String email;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    private NextOfKin nextOfKin;

    public Patient(String refNo,
                   String name,
                   LocalDate dateOfBirth,
                   String idNumber,
                   String address,
                   String county,
                   String subCounty,
                   String telephone,
                   String email,
                   Gender gender,
                   MaritalStatus maritalStatus) {
        this.refNo = refNo;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
        this.address = address;
        this.county = county;
        this.subCounty = subCounty;
        this.telephone = telephone;
        this.email = email;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}
