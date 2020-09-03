package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.wedding.AnswerWedding;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("СheckWedding is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return new AnswerWedding();
    }
}
