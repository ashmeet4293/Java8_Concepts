package com.company.practice.bifunction;

import java.util.function.BiFunction;

class Student{
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}

public class ProgramToCreateStudentObjectByTakingNameAndRollNo {
    public static void main(String[] args) {

        BiFunction<String, Integer, Student> getStudentFunction= (name, rollNo)->{
            return new Student(name, rollNo);
        };

        System.out.println(getStudentFunction.apply("Ashmeet",24));
        System.out.println(getStudentFunction.apply("Pawan",12));


    }
}
