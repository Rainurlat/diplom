
package com.boots.repository;
import com.boots.entity.Theory;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TheoryRepository extends JpaRepository<Theory, Long> {
//    Questions findByQuestions(String questions);
}
