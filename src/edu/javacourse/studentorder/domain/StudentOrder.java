package edu.javacourse.studentorder.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StudentOrder<StudentOrderStatus> {
    private long studentOrderId;
    private StudentOrderStatus studentOrderStatus;
    private LocalDateTime studentOrderDate;
    private Adult husband;
    private Adult wife;
    private List<Child> children;
    private String marriageCertificateId;
    private String marriageOffice;
    private LocalDate marriageDate;

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public  void  addChild(Child child){
        if (children == null){
            children = new ArrayList<>(5);
        }
        children.add(child);
    }

    public List<Child> getChildren() {
        return children;
    }

    public String getMarriageCertificateId() {
        return marriageCertificateId;
    }

    public void setMarriageCertificateId(String marriageCertificateId) {
        this.marriageCertificateId = marriageCertificateId;
    }

    public String getMarriageOffice() {
        return marriageOffice;
    }

    public void setMarriageOffice(String marriageOffice) {
        this.marriageOffice = marriageOffice;
    }

    public LocalDate getMarriageDate(LocalDate of) {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }

    public String toString() {
        return "StudentOrder{" +
                "studentOrderId=" + studentOrderId +
                ", studentOrderStatus=" + studentOrderStatus +
                ", studentOrderDate=" + studentOrderDate +
                ", husband=" + husband +
                ", wife=" + wife +
                ", children=" + children +
                ", marriageCertificateId='" + marriageCertificateId + '\'' +
                ", marriageOffice=" + marriageOffice +
                ", marriageDate=" + marriageDate +
                '}';
    }
}