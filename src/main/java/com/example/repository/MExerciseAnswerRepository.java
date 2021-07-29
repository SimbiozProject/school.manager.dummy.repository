package com.example.repository;

import com.example.bean.MExerciseAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MExerciseAnswerRepository extends JpaRepository<MExerciseAnswer, Long> {

}
