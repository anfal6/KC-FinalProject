package com.example.cw6;

public class Student {
    private String studentName;
    private int studentAge;
    private int studentImg;
    private int studentGrade;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentImg() {
        return studentImg;
    }

    public void setStudentImg(int studentImg) {
        this.studentImg = studentImg;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public Student(String studentName, int studentAge, int studentImg, int studentGrade) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentImg = studentImg;
        this.studentGrade = studentGrade;
    }
}
