package com.example.repository;

import com.example.bean.MMenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MMenuItemRepository extends JpaRepository<MMenuItem, Long> {

}
