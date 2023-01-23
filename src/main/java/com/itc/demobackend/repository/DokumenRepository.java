package com.itc.demobackend.repository;

import com.itc.demobackend.entity.Dokumen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DokumenRepository extends JpaRepository<Dokumen, Long> {
}
