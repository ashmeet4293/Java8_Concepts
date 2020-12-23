package com.company.practice.consumer;

public class Student {

    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
