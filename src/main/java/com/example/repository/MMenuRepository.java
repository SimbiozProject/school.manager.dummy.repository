package com.example.repository;

import com.example.bean.MMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MMenuRepository extends JpaRepository<MMenu, Long> {

}
