package com.example.repository;

import com.example.bean.MKnowledgeTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MKnowledgeTestRepository extends JpaRepository<MKnowledgeTest, Long> {


}
