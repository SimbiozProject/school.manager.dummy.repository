package com.example.repository;

import com.example.bean.Test;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TestRepository extends PagingAndSortingRepository<Test, Long> {
}
