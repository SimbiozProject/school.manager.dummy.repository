package com.example.repository;

import com.example.bean.MLesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MLessonRepository extends JpaRepository<MLesson, Long> {

}
