package com.example.web.dao.repository;

import com.example.web.bean.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {

   /* UserAnswerTable findByUserName(String userName);*/
}
