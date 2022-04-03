package com.boots.service;

import com.boots.entity.Questions;
import com.boots.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Service
public class QuestionService {

    @PersistenceContext
    private EntityManager em;
    @Autowired
    QuestionsRepository questionsRepository;

    public Questions findQuestionsById(Long QuestionsId) {
        Optional<Questions> QuestionsFromDb = questionsRepository.findById(QuestionsId);
        return QuestionsFromDb.orElse(new Questions());
    }

    public List<Questions> allQuestions() {
        return questionsRepository.findAll();
    }



//    public boolean saveQuestions(Questions questions) {
//        Questions QuestionsFromDB = questionsRepository.findByQuestions(questions.getQuestions());
//
//        if (QuestionsFromDB != null) {
//            return false;
//        }
//
//
//        questionsRepository.save(questions);
//        return true;
//    }
//
//    public boolean deleteQuestions(Long QuestionsId) {
//        if (questionsRepository.findById(QuestionsId).isPresent()) {
//            questionsRepository.deleteById(QuestionsId);
//            return true;
//        }
//        return false;
//    }

    public List<Questions> QuestionsgtList(Long idMin) {
        return em.createQuery("SELECT u FROM User u WHERE u.id > :paramId", Questions.class)
                .setParameter("paramId", idMin).getResultList();
    }
}
