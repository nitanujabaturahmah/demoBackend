package com.itc.demobackend.repository;

import com.itc.demobackend.entity.CalonSiswa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CalonSiswaRepository extends JpaRepository<CalonSiswa, Long> {
}
