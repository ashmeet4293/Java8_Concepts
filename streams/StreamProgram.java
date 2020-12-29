package com.company.practice.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamProgram {

    public static void main(String[] args) {

        List<Student> studentsMock = Student.getStudents();

        System.out.println("________________STUDENT HAVING PERCENTAGE LESS THAN 55_______________");
        /*Filtering the students based on percentage<55*/
        List<Student> studentList = studentsMock.stream().filter(student -> student.getPercentage()<55).collect(Collectors.toList());
        studentList.forEach(System.out::println);


        System.out.println("________________INCREASE PERCENT BY 1_______________");
        /*Increasing the students percentage by 1*/
        List<Student> increasedStudentPercentage = studentsMock.stream().map(student -> {
            student.setPercentage(student.getPercentage()+1);
            return student;
        }).collect(Collectors.toList());
        increasedStudentPercentage.forEach(System.out::println);

        System.out.println("________________Total Number of students WHOSE PERCENTAGE IS LESS THAN 55_______________");
        long totalStudents = studentList.stream().count();
        System.out.println(totalStudents);

        System.out.println("________________LIST OF STUDENT SORTED BASED ON PERCENTAGE DESC_______________");
        List<Student> sortedStudents= studentsMock.stream().sorted((student1, student2) -> student1.getPercentage() < student2.getPercentage() ? 1 : -1).collect(Collectors.toList());
        sortedStudents.forEach(System.out::println);

        System.out.println("________________LOWEST PERCENTAGE STUDENT_______________");
       Student lowestPercentageStudent= studentsMock.stream().min((student1, student2) -> student1.getPercentage() > student2.getPercentage() ? 1 : -1).get();
        System.out.println(lowestPercentageStudent);

        System.out.println("________________IS STUDENT PERCENTAGE REPRESENT FAILED_______________");
        boolean isFailedStudent=studentsMock.stream().noneMatch(student -> student.getPercentage() < 40);
        Predicate<Student> passedWithDistinction = student -> student.getPercentage() >= 80;
        boolean isSomeStudentWithDistinction =studentsMock.stream().anyMatch(passedWithDistinction);
        boolean isAllStudentWithDistinction = studentsMock.stream().allMatch(passedWithDistinction);

        System.out.println("DO WE HAVE FAILED STUDENT ? "+isFailedStudent);
        System.out.println("DO WE HAVE SOME STUDENTS WITH DISTINCTION ? "+isSomeStudentWithDistinction);
        System.out.println("DO WE HAVE ALL STUDENTS WITH DISTINCTION  ? "+isAllStudentWithDistinction);

        System.out.println("________________STUDENT GROUPED BASED ON DIVISION _______________");
        Function<Student, String> percentageGrouping = student -> student.getPercentage() >= 80 ? "Dist "
                : student.getPercentage() <80 && student.getPercentage() >=60 ? "FIRST"
                : student.getPercentage() <60 && student.getPercentage() >=45 ? "SECOND"
                : student.getPercentage() <45 && student.getPercentage() >=32 ? "THIRD"
                : "NO PERCENTAGE";

        Map<String, List<Student>> studentListGrouped = studentsMock.stream().collect(Collectors.groupingBy(percentageGrouping));


        for (Map.Entry<String,  List<Student>> entry : studentListGrouped.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }

    }
}
