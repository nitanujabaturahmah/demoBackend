package com.itc.demobackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Rincian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tinggiBadan;

    private String beratBadan;

    private String jarakRumah;

    private String waktuTempuh;

    private String jumlahSaudara;
}
