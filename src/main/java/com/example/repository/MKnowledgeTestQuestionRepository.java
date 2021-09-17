package com.example.repository;

import com.example.bean.MKnowledgeTestQuestion;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MKnowledgeTestQuestionRepository extends JpaRepository<MKnowledgeTestQuestion, Long> {
  List<MKnowledgeTestQuestion> findAllByIdKnowledgeTest(Long id, Pageable pageable);
}
