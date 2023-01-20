package com.itc.demobackend.entity;

import com.itc.demobackend.enums.PendidikanTerakhir;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;

@Data
@Entity
@Table
public class Orangtua {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String namaAyah;

    private String tahunLahirAyah;


    @Enumerated(EnumType.STRING)
    private PendidikanTerakhir pendidikanTerakhirAyah;

    private String pekerjaanAyah;

    private String penghasilanPerbulanAyah;

    private String namaIbu;

    private String tahunLahirIbu;

    @Enumerated(EnumType.STRING)
    private PendidikanTerakhir pendidikanTerakhirIbu;

    private String pekerjaanIbu;

    private String penghasilanPerbulanIbu;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "calon_siswa_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "calon_siswa_id_fk"))
    private CalonSiswa calonSiswa;
}
