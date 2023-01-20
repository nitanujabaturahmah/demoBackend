package com.itc.demobackend.entity;

import com.itc.demobackend.enums.PendidikanTerakhir;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;

@Data
@Entity
@Table(name = "orangtua")
@SQLDelete(sql = "UPDATE orangtua SET deleted = true WHERE id = ?")
public class Orangtua {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String namaAyah;

    private String tahunLahirAyah;

    private PendidikanTerakhir pendidikanTerakhirAyah;

    private String pekerjaanAyah;

    private String penghasilanPerbulanAyah;

    private String namaIbu;

    private String tahunLahirIbu;

    private PendidikanTerakhir pendidikanTerakhirIbu;

    private String pekerjaanIbu;

    private String penghasilanPerbulanIbu;
}
