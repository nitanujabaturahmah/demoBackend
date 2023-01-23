package com.itc.demobackend.repository;

import com.itc.demobackend.entity.Dokumen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DokumenRepository extends JpaRepository<Dokumen, Long> {
//    Optional<Dokumen> findBySecureId (String secureId);
//
//    Optional<Dokumen> findById (Long dokumenId);
}
