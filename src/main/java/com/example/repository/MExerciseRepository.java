package com.example.repository;

import com.example.bean.MExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MExerciseRepository extends JpaRepository<MExercise, Long> {

}
