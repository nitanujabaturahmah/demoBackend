package com.itc.demobackend.repository;

import com.itc.demobackend.entity.Orangtua;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrangtuaRepository extends JpaRepository<Orangtua, Long> {
//    Optional<Orangtua> findBySecureId (String secureId);
//
//    Page<Orangtua> findByNamaAyahLikeIgnoreCase(String nameOrangtua, Pageable pageable);
//
//    Optional<Orangtua> findById(Long orangtuaId);
}
