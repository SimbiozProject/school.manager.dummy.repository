package com.example.repository;

import com.example.bean.MCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MCourseRepository extends JpaRepository<MCourse, Long> {
}
