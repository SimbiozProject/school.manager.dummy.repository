package com.example.web.dao.repository;

import com.example.web.bean.Crm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrmRepository extends JpaRepository<Crm, Long> {
}
