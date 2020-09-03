package edu.javacourse.studentorder.validator.register;

import edu.javacourse.studentorder.domain.children.AnswerChildren;
import edu.javacourse.studentorder.domain.StudentOrder;

public class ChildrenValidator {
     public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("СheckChildren is running");
        return new AnswerChildren();
    }
}
