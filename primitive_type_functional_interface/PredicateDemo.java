package com.company.practice.primitive_type_functional_interface;

import java.util.function.IntPredicate;

public class PredicateDemo {
    public static void main(String[] args) {
        IntPredicate predicate=(x)-> x%2==0;


        int [] values={1,2,3,4,5,6,7,8};
        for (int x: values           ) {
            if(predicate.test(x)){
                System.out.println("Even : "+x);
            }
        }


    }
}
