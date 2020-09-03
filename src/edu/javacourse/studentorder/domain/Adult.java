package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Adult extends Person {


    private String passportSeria;
    private String passportNumber;
    private LocalDate issueDate;
    private String issueDepartment;
    private String university;
    private String studentId;

    public Adult() {

        this.passportSeria = passportSeria;
    }

    public Adult(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        super(surName, givenName, patronymic, dateOfBirth);
    }

    @Override
    public void setPassportSeria(String s) {
        passportSeria = s;
    }


    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String student) {
        this.studentId = studentId;
    }

    public String getPassportSerial() {
        return passportSeria;
    }

    public void setPassportSerial(String passportSerial) {
        this.passportSeria = passportSeria;
    }


    public String toString() {
        return "Adult{" +
                "passportSeria='" + passportSeria + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", issueDate=" + issueDate +
                ", issueDepartment=" + issueDepartment +
                ", univesity=" + university +
                ", studentId='" + studentId + '\'' +
                "} " + super.toString();
    }
}
