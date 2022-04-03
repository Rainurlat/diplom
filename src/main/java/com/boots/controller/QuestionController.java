package com.boots.controller;

import com.boots.service.QuestionService;
import com.boots.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class QuestionController {

  @Autowired
    private QuestionService questionsService;

    @GetMapping("/questions")
    public String questionsList(Model model) {
        model.addAttribute("allQuestions", questionsService.allQuestions());
        return "questions";
    }
    @PostMapping("/questions")
    public String  questions(  Model model) {

        return "questions";
    }

//    @PostMapping("/questions")
//    public String  questions(@RequestParam(required = true, defaultValue = "" ) Long QuestionsId,
//                              @RequestParam(required = true, defaultValue = "" ) String action,
//                              Model model) {
//        if (action.equals("delete")){
//           // questionsService.deleteQuestions(QuestionsId);
//        }
//        return "redirect:/questions";
//    }

//    @GetMapping("/questions/gt/{QuestionsId}")
//    public String  gtUser(@PathVariable("QuestionsId") Long QuestionsId, Model model) {
//        model.addAttribute("allQuestions", questionsService.QuestionsgtList(QuestionsId));
//        return "questions";
//    }
}
