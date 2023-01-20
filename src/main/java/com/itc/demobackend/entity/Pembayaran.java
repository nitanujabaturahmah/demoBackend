package com.itc.demobackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Pembayaran {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPembayaran;

    @Column(nullable = false)
    private String nominal;

    @Column(nullable = false)
    private String gelombang;

    @Column(nullable = false)
    private String keterangan;
}
