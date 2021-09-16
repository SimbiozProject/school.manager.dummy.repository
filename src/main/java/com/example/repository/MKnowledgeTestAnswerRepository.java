package com.example.repository;

import com.example.bean.MKnowledgeTestAnswer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MKnowledgeTestAnswerRepository extends JpaRepository<MKnowledgeTestAnswer, Long> {
  List<MKnowledgeTestAnswer> findAllByIdKnowledgeTest(Long id);
}
