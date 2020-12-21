package com.company.practice.predicate;

import java.util.function.Predicate;

/**Program to display names starts with K by using Predicate*/
public class ProgramToDisplayNameStartsWithKUsingPredicate {
    public static void main(String[] args) {

        Predicate<String> predicateStartsWithK=(name)-> name.startsWith("K");
        String [] names={"Karan","Kumar","Ashmeet","Pawan","Karishma"};

        for (String name :names) {
            if(predicateStartsWithK.test(name)){
                System.out.println(name);
            }
        }


    }
}
