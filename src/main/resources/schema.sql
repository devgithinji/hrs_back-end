-- schema.sql

DROP TABLE IF EXISTS next_of_kin;
DROP TABLE IF EXISTS patient;

CREATE TABLE patient
(
    id             BIGINT AUTO_INCREMENT NOT NULL,
    ref_no         VARCHAR(255)          NULL,
    name           VARCHAR(255)          NULL,
    date_of_birth  DATE                  NULL,
    id_number      VARCHAR(255)          NULL,
    address        VARCHAR(255)          NULL,
    county         VARCHAR(255)          NULL,
    sub_county     VARCHAR(255)          NULL,
    telephone      VARCHAR(255)          NULL,
    email          VARCHAR(255)          NULL,
    gender         VARCHAR(255)          NULL,
    marital_status VARCHAR(255)          NULL,
    CONSTRAINT pk_patient PRIMARY KEY (id)
);

CREATE TABLE next_of_kin
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    name          VARCHAR(255)          NULL,
    date_of_birth DATE                  NULL,
    id_no         VARCHAR(255)          NULL,
    gender        VARCHAR(255)          NULL,
    relationship  VARCHAR(255)          NULL,
    telephone     VARCHAR(255)          NULL,
    patient_id    BIGINT                NULL,
    CONSTRAINT pk_nextofkin PRIMARY KEY (id),
    CONSTRAINT fk_nextofkin_on_patient FOREIGN KEY (patient_id) REFERENCES patient (id)
);
