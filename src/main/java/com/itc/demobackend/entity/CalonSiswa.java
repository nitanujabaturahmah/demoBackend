package com.itc.demobackend.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class CalonSiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nama;

    private String namaAyah;

    private String noTelephone;

    private String password;

    private String email;
}
