package com.example.repository;

import com.example.bean.MProfileRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MProfileRoleRepository extends JpaRepository<MProfileRole, Long> {

}
