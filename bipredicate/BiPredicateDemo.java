package com.company.practice.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        System.out.println("Bi PredicateDemo");
        BiPredicate<Double, Double> biPredicateToCheckOddOrEven= (x, y) -> (x+y)%2 == 0;

        if(biPredicateToCheckOddOrEven.test(20.0,30.0)){
            System.out.println("Is Even");
        }
    }
}
