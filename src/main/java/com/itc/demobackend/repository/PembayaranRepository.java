package com.itc.demobackend.repository;

import com.itc.demobackend.entity.Pembayaran;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PembayaranRepository extends JpaRepository<Pembayaran, Long> {
//    Optional<Pembayaran> findBySecureId (String secureId);
//
//    Optional<Pembayaran> findById(Long pembayaranId);
}
