package com.example.repository;

import com.example.bean.MUserPin;
import com.example.bean.MUserProfile;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MUserPinRepository extends JpaRepository<MUserPin, Long> {

}
