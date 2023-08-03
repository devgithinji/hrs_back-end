package com.healthrecord.healthrecord.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PatientCreateResponse {
    private String name;
    private String refNo;
    private String message;
}
