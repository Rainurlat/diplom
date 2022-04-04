package com.boots.service;

import com.boots.entity.Questions;
import com.boots.entity.Theory;
import com.boots.repository.QuestionsRepository;
import com.boots.repository.TheoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
public class TheoryService  {

    @PersistenceContext
    private EntityManager em;
    @Autowired
    TheoryRepository theoryRepository;

    public Theory findTheoryById(Long TheoryId) {
        Optional<Theory> TheoryFromDb = theoryRepository.findById(TheoryId);
        return TheoryFromDb.orElse(new Theory());
    }

    public List<Theory> allTheory() {
        return theoryRepository.findAll();
    }

    public List<Theory> TheorygtList(Long idMin) {
        return em.createQuery("SELECT u FROM User u WHERE u.id > :paramId", Theory.class)
                .setParameter("paramId", idMin).getResultList();
    }
}

