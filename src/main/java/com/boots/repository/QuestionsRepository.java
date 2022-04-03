package com.boots.repository;

import com.boots.entity.Questions;

import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestionsRepository extends JpaRepository<Questions, Long> {
//    Questions findByQuestions(String questions);
}
