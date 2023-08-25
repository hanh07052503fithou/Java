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

}
