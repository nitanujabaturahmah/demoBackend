package com.itc.demobackend.repository;

import com.itc.demobackend.entity.Peserta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PesertaRepository extends JpaRepository<Peserta, Long> {
//    Optional<Peserta> findBySecureId (String secureId);
//
//    Page<Peserta> findByNamaLengkapLikeIgnoreCase(String namePeserta, Pageable pageable);
//
//    Optional<Peserta> findById(Long pesertaId);
}
