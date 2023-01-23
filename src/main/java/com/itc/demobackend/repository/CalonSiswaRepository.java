package com.itc.demobackend.repository;

import com.itc.demobackend.entity.CalonSiswa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CalonSiswaRepository extends JpaRepository<CalonSiswa, Long> {

//    Optional<CalonSiswa> findBySecureId (String secureId);
//
//    Page<CalonSiswa> findByNameLikeIgnoreCase(String nameSiswa, Pageable pageable);
//
//    Optional<CalonSiswa> findById(Long calonSiswaId);
}
