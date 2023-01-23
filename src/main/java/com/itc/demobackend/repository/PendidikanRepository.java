package com.itc.demobackend.repository;

import com.itc.demobackend.entity.Pendidikan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PendidikanRepository extends JpaRepository<Pendidikan, Long> {
}
