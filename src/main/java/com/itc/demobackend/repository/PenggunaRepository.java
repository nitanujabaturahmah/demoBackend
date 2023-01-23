package com.itc.demobackend.repository;

import com.itc.demobackend.entity.Pengguna;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PenggunaRepository extends JpaRepository<Pengguna, Long> {
//    Optional<Pengguna> findBySecureId (String secureId);
//
//    Page<Pengguna> findByNamaPenggunaLikeIgnoreCase(String namePengguna, Pageable pageable);
//
//    Optional<Pengguna> findById(Long penggunaId);
}
