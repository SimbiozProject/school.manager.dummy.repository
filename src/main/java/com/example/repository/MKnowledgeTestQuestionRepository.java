package com.example.repository;

import com.example.bean.MKnowledgeTestQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MKnowledgeTestQuestionRepository extends JpaRepository<MKnowledgeTestQuestion, Long> {

}
