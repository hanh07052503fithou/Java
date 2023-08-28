package com.vti.entity;

import java.time.LocalDate;

public class Exam {
    int ExamID;
    int code;
    String title;
    CategoryQuestion category;
    int Duration;
    Account creator;
    LocalDate createDate;

    ExamQuestion[] examQuestions;

    public int getExamID() {
        return ExamID;
    }

    public void setExamID(int examID) {
        ExamID = examID;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryQuestion getCategory() {
        return category;
    }

    public void setCategory(CategoryQuestion category) {
        this.category = category;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public ExamQuestion[] getExamQuestions() {
        return examQuestions;
    }

    public void setExamQuestions(ExamQuestion[] examQuestions) {
        this.examQuestions = examQuestions;
    }
}
