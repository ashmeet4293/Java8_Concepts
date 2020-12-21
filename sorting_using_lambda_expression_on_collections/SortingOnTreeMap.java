package com.company.practice.sorting_using_lambda_expression_on_collections;

import java.util.Map;
import java.util.TreeMap;

public class SortingOnTreeMap {
    public static void main(String[] args) {

        Map<Integer, String> students= new TreeMap<>((key1, key2)-> (key1 > key2)?1:(key1 < key2)?-1:0);
        students.put(2, "Ram");
        students.put(5, "Hari");
        students.put(1, "Sita");
        students.put(3, "Ashmeet");
        students.put(5, "Pawan");

        System.out.println("After Sorting Ascending by Map Keys ");
        students.keySet().iterator().forEachRemaining(System.out::println);
    }
}
