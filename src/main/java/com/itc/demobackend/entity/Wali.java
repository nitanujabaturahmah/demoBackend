package com.itc.demobackend.entity;

import com.itc.demobackend.enums.PendidikanTerakhir;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Wali {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idWali;

    private String namaWali;

    private String tahunLahir;

    private PendidikanTerakhir pendidikanTerakhir;

    private String Pekerjaan;

    private String penghasilanPerbulan;
}
