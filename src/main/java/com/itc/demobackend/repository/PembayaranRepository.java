package com.itc.demobackend.repository;

import com.itc.demobackend.entity.Pembayaran;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PembayaranRepository extends JpaRepository<Pembayaran, Long> {
}
