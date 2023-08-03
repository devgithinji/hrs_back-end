package com.healthrecord.healthrecord.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class PatientRefNoGenerator {
    public static String generatePatientRefNo() {
        Random random = new Random();
        int randomNumber = random.nextInt(9000) + 1000;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        String timestamp = now.format(dateTimeFormatter);

        return "REF_" + timestamp + "-" + randomNumber;
    }
}
