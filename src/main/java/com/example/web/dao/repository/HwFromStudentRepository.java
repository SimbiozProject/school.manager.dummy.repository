package com.example.web.dao.repository;

import com.example.web.bean.HwFromStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HwFromStudentRepository extends JpaRepository<HwFromStudent, Long> {
}
