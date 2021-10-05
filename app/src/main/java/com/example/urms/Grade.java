package com.example.urms;


public class Grade {
    String course;
    String grade;

    public Grade(String course, String grade) {
        this.course = course;
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public String getGrade() {
        return grade;
    }
}