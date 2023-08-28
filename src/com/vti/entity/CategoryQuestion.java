package com.vti.entity;

public class CategoryQuestion {
    int CategoryID;
    String CategoryName;

    Question[] questions;
    Exam[] exams;

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public Exam[] getExams() {
        return exams;
    }

    public void setExams(Exam[] exams) {
        this.exams = exams;
    }
}
