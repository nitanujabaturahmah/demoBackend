package com.itc.demobackend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table
public class Pendidikan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPendidikan;

    private String tamatSD;

    private String nisn;

    private String pindahan;

    private String kelas;

    private String namaSekolah;

    private Date tanggalDaftar;

    private String status;

    private String nis;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "calon_siswa_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "calon_siswa_id_fk"))
    private CalonSiswa calonSiswa;
}
