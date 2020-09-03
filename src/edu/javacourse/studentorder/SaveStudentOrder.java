package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Address;
import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.validator.CityRegisterValidator;

import java.time.LocalDate;

public class SaveStudentOrder {
    private static StudentOrder stOr;

    public static void main(String[] args) {

        StudentOrder studentOrder = buildStudentOrder(1);
        printStudentOrder(studentOrder);
        CityRegisterValidator cityRegisterValidator = new CityRegisterValidator();
        cityRegisterValidator.checkCityRegister(studentOrder);
    }

    static void printStudentOrder(StudentOrder stOr) {
        System.out.println(stOr.getStudentOrderId());
        long id = stOr.getStudentOrderId();
        Address address = new Address("195000", "Заневский пр.", "12", "", "142");
        // Муж
        Adult husband = new Adult("Петров", "Виктор", "Сергеевич", LocalDate.of(1997, 8, 24));
        husband.setPassportSeria("1002");
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssueDate(LocalDate.of(2017, 9, 15));
        husband.setIssueDepartment("Отдел милиции №" + id);
        husband.setStudentId("" + (100000 + id));
        husband.setAddress(address.toString());
        // Жена
        Adult wife = new Adult("Петрова", "Вероника", "Алекссевна", LocalDate.of(1998, 3, 12));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate(LocalDate.of(2018, 4, 5));
        wife.setIssueDepartment("Отдел милиции №" + id);
        wife.setStudentId("" + (200000 + id));
        wife.setAddress(address.toString());
        // Ребенок
        Child child1 = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
        child1.setCertificateNumber("" + (300000 + id));
        child1.setIssueDate(LocalDate.of(2018, 7, 19));
        child1.setIssueDepartment("Отдел ЗАГС №" + id);
        child1.setAddress(address.toString());

        // Ребенок2
        Child child2 = new Child("Петров", "Евгенний", "Викторович", LocalDate.of(2018, 6, 29));
        child2.setCertificateNumber("" + (700000 + id));
        child2.setIssueDate(LocalDate.of(2018, 7, 19));
        child2.setIssueDepartment("Отдел ЗАГС №" + id);
        child2.setAddress(address.toString());


        stOr.setHusband(husband);
        stOr.setWife(wife);
        stOr.addChild(child1);
        stOr.addChild(child2);
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        StudentOrder so1 = so;
        printStudentOrder(so1);
        so.setMarriageCertificateId("" + (123456000 + id));
        so.setMarriageDate(LocalDate.of(2016, 7, 4));
        so.setMarriageOffice("Отдел ЗАГС");

        return so;
    }

}