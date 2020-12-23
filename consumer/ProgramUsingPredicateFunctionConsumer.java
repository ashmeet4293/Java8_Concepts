package com.company.practice.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ProgramUsingPredicateFunctionConsumer {
    public static void main(String[] args) {

        Function<Double, String> getGradeByPercentage = (percentage)->{
            return percentage >= 80 ? " A Grade " :
                    percentage <80 && percentage >=60 ? " B Grade " :
                            percentage < 60 && percentage >=45 ? " C Grade":
                                    percentage <45 && percentage >32 ? " D Grade ":
                                            "Failed";
        };

        Consumer<Student> studentConsumer = (student)->{
            System.out.println("Student Name : "+student.name);
            System.out.println("Student Percentage : "+student.marks);
        };

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ashmeet ", 20));
        students.add(new Student("Pawan ", 75));
        students.add(new Student("Tiwary ", 90));
        students.add(new Student("Hari ", 55));
        students.add(new Student("Keshab", 46));

        for (Student student: students  ) {
            studentConsumer.accept(student);
            System.out.println("GRADE : "+getGradeByPercentage.apply(student.marks));
            System.out.println("__________________________________________________________");

        }


    }
}
