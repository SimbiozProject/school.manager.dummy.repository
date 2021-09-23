package com.example.repository;

import com.example.bean.TestQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TestQuestionRepository extends JpaRepository<TestQuestion, Long> {
}
