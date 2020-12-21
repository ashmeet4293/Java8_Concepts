package com.company.practice.sorting_using_lambda_expression_on_collections;

import java.util.*;

/*Sorting the elements on List*/
public class SortingOnList {

    public static void main(String[] args) {

        List<Student> students= new ArrayList<>();
        students.add(new Student("Ram", 2));
        students.add(new Student("Sita", 6));
        students.add(new Student("Hari", 1));
        students.add(new Student("Ashmeet", 3));

        System.out.println("Before Sorting ");
        students.forEach(System.out::println);

        /*Creating Comparator Reference varibale is not required and you can pass Lambda Expression on sort 2nd argument as Collections.sort(students, (student1, student2)->{});
        * However, Iam creating this for sake of understandability
        * Using Lambda We are defining compare() method of Comparator Functional Interface
        * */

        Comparator<Student> myCustomComparatorForSortByRollNoAsc= (student1, student2)->{
            return (student1.rollNo> student2.rollNo)?1:(student1.rollNo< student2.rollNo)?-1:0;
        };

        Collections.sort(students, myCustomComparatorForSortByRollNoAsc);

        System.out.println("After Sorting ");
        students.forEach(System.out::println);


    }
}
