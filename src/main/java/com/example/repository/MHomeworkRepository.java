package com.example.repository;

import com.example.bean.MHomework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MHomeworkRepository extends JpaRepository<MHomework, Long> {


}
