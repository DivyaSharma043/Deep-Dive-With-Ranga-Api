package com.racloop.api.ranga.api_project;

import java.util.List;

public class Question {
    private String id;
    private String title;
    private String description;
    private List<String> correct_answer;
    private List<String> options;

    public Question(String id, String title, String description, List<String> correct_answer, List<String> options) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.correct_answer = correct_answer;
        this.options = options;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(List<String> correct_answer) {
        this.correct_answer = correct_answer;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
