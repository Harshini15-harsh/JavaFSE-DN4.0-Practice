package com.harshini.di;

public class Student {
    private College college;

    // Constructor Injection
    public Student(College college) {
        this.college = college;
    }

    public void showCollege() {
        college.collegeInfo();
    }
}
