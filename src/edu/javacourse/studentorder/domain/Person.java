package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public abstract class Person {
    private String surName;
    private String givenName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String address;

    public  Person(){

    }
    public Person(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        this.surName = surName;
        this.givenName = givenName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGiveName() {
        return givenName;
    }

    public void setGiveName(String giveName) {
        this.givenName = giveName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public abstract void setPassportSeria(String s);


    public String toString() {
        return "Person{" +
                "surName='" + surName + '\'' +
                ", givenName='" + givenName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                '}';
    }
}