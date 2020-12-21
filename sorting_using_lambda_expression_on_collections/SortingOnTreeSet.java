package com.company.practice.sorting_using_lambda_expression_on_collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortingOnTreeSet {

    public static void main(String[] args) {

        Comparator<Student> myCustomComparatorForSortByRollNoDesc= (student1, student2)->{
            return (student1.rollNo < student2.rollNo)?1:(student1.rollNo> student2.rollNo)?-1:0;
        };


        Set<Student> students= new TreeSet<>(myCustomComparatorForSortByRollNoDesc);
        students.add(new Student("Ram", 2));
        students.add(new Student("Sita", 6));
        students.add(new Student("Hari", 1));
        students.add(new Student("Ashmeet", 3));

        System.out.println("After Sorting Descending by Roll No ");
        students.forEach(System.out::println);
    }

}
