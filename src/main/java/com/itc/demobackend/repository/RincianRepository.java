package com.itc.demobackend.repository;

import com.itc.demobackend.entity.Rincian;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RincianRepository extends JpaRepository<Rincian, Long> {
//    Optional<Rincian> findBySecureId (String secureId);
//
//    Page<Rincian> findByCalonSiswaLikeIgnoreCase(Rincian rincian, Pageable pageable);
//
//    Optional<Rincian> findById (Long id);
}
