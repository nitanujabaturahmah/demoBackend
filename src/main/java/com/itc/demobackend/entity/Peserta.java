package com.itc.demobackend.entity;

import com.itc.demobackend.enums.BerkebutuhanKhusus;
import com.itc.demobackend.enums.JenisKelamin;
import com.itc.demobackend.enums.Transportasi;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table
public class Peserta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPeserta;

    private String namaLengkap;

    private String namaPanggilan;

    @Enumerated(EnumType.STRING)
    private JenisKelamin jenisKelamin;

    private String nik;

    private String tempatLahir;

    private Date tanggalLahir;

    private Integer umur;

    private String agama;

    @Enumerated(EnumType.STRING)
    private BerkebutuhanKhusus berkebutuhanKhusus;

    private String kpJln;

    private String dusun;

    private String desaKelurahan;

    private String rtRw;

    private String kecamatan;

    private String kodePos;

    private String tempatTinggalOrtu;

    @Enumerated(EnumType.STRING)
    private Transportasi transportasi;

    private String noTelephone;

    private String noKps;

    private String noKip;

    private String noKis;

    private String email;
}
