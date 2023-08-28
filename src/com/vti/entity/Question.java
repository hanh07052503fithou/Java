package com.vti.entity;

import java.time.LocalDate;

public class Question {
    int QuestionID;
    String content;

    CategoryQuestion Category;
    TypeQuestion type;
    Account creator;
    LocalDate CreateDate;

    Answer[] Answers;
    ExamQuestion[] examQuestions;

}
