package com.company.practice.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student{
    String name;
    double percentage;

    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }
}

/**
 * Program to find Student Grade by using Function
 * */
public class ProgramToFindStudentGradeByFunction {
    public static void main(String[] args) {

        Function<Student, String> getGradeFunction= (student)-> student.percentage>=80?"A Grade":
                student.percentage <80 && student.percentage >=60 ? "B Grade" :
                student.percentage <60 && student.percentage >=45 ? "C Grade": "D Grade";

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ashmeet", 70));
        students.add(new Student("Ram", 90));
        students.add(new Student("Pawan", 45));
        students.add(new Student("Hari", 30.66));

        students.forEach(student -> {
            System.out.println(student.name +" : "  + student.percentage+ "% : "+ getGradeFunction.apply(student));
        });


    }
}
