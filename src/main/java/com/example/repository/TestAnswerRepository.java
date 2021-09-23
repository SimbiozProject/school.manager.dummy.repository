package com.example.repository;

import com.example.bean.TestAnswer;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface TestAnswerRepository extends PagingAndSortingRepository<TestAnswer, Long> {

}
