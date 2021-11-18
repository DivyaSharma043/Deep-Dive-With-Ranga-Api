package com.racloop.api.ranga.controller;


import com.racloop.api.ranga.api_project.Question;
import com.racloop.api.ranga.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class SurveyController {

    @Autowired
    public SurveyService surveyService;

    @GetMapping("/surveys/{surveyId}/questions")
    public List<Question> retrieveQuestionsForSurvey(@PathVariable String surveyId)
    {

        return surveyService.retrieveQuestions(surveyId);
    }

    @PostMapping("/surveys/{surveyId}/questions")
    public ResponseEntity<Void> addQuestionsToSurvey(@PathVariable String surveyId, @RequestBody Question newQuestions)
    {


        Question question = surveyService.addQuestion(surveyId, newQuestions);

        if(question==null)
        {
            return ResponseEntity.noContent().build();
        }

        URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(question.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/surveys/{surveyId}/questions/{questionId}")
    public Question retrieveDetailsForQuestions(@PathVariable String surveyId, @PathVariable String questionId)
    {

        return surveyService.retrieveQuestion(surveyId, questionId);
    }
}
