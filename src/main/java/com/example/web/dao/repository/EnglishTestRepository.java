package com.example.web.dao.repository;


import com.example.web.bean.EnglishTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnglishTestRepository extends JpaRepository<EnglishTest, Long> {

   /* @Query(value = "SELECT * FROM question_answer WHERE id = ?", nativeQuery = true)
    QuestionAnswerTable findQuestionAnswerTablesById(Long id);

    @Transactional
    @Modifying
    @Query(value = "UPDATE  question_answer " +
            "SET question = ?2, first_answer = ?3, second_answer = ?4, third_answer = ?5, fourth_answer = ?6, " +
            "right_answer = ?7 WHERE question_answer.id = ?1 ", nativeQuery = true)
    void updateDataInTest(Long id, String question, String firstAnswer, String secondAnswer, String thirdAnswer,
                          String fourthAnswer, String rightAnswer);
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM question_answer WHERE id = ?1", nativeQuery = true)
    void deleteById(Long id);*/
}
