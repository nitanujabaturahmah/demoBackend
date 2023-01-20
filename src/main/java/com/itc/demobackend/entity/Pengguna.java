package com.itc.demobackend.entity;

import com.itc.demobackend.enums.LevelPengguna;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Pengguna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPengguna;

    private String namaPengguna;


    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private LevelPengguna levelPengguna;


}
