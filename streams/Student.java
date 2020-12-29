package com.company.practice.streams;

import java.util.ArrayList;
import java.util.List;

public class Student{
    private String name;
    private double percentage;

    public Student(String name, double percentage){
        this.name=name;
        this.percentage=percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", percentage =" + percentage +
                '}';
    }

    public static List<Student> getStudents(){
        List<Student> students= new ArrayList<>();
        students.add(new Student("Ashmeet", 20));
        students.add(new Student("Tiwari", 69));
        students.add(new Student("Pawan", 65));
        students.add(new Student("Chinkiy", 60));
        students.add(new Student("Pinky", 80));
        students.add(new Student("Reeta", 100));
        students.add(new Student("Viraj", 54));

        return students;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}