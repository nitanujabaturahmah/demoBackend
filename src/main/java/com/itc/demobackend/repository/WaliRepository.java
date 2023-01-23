package com.itc.demobackend.repository;

import com.itc.demobackend.entity.Wali;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WaliRepository extends JpaRepository<Wali, Long> {
//    Optional<Wali> findBySecureId(String secureId);
//
//    Optional<Wali> findById(Long waliId);
}
