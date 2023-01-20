package com.itc.demobackend.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Dokumen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDokumen;

    private String kartuKeluarga;

    private String akteLahir;

    private String pasFoto;

}
