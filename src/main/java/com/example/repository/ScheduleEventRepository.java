package com.example.repository;

import com.example.bean.ScheduleEvent;
import com.example.bean.TestQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ScheduleEventRepository extends PagingAndSortingRepository<ScheduleEvent, Long> {
}
