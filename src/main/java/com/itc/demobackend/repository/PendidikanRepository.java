package com.itc.demobackend.repository;

import com.itc.demobackend.entity.Pendidikan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PendidikanRepository extends JpaRepository<Pendidikan, Long> {
//    Optional<Pendidikan> findBySecureId (String secureId);
//
//    Page<Pendidikan> findByNisnLikeIgnoreCase(String pendidikan, Pageable pageable);
//
//    Optional<Pendidikan> findById (Long id);
}
