package com.example.repository;

import com.example.bean.MUserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MUserProfileRepository extends JpaRepository<MUserProfile, Long> {


}
