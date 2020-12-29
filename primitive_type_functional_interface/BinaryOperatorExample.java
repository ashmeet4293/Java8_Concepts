package com.company.practice.primitive_type_functional_interface;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        BinaryOperator<Double> productBinaryOperator= (x, y)-> x*y;

        BinaryOperator<String> stringBinaryOperator=(firstName, lastName)-> firstName+", "+lastName;

        /*Primitive Version of Binary Operator*/
        IntBinaryOperator sumOfTwoValueUsingBinaryOperator = (x, y) -> x+y;

        System.out.println("BinaryOperator For Double Type "+productBinaryOperator.apply(2.4,8.9));
        System.out.println("BinaryOperator for String Type"+stringBinaryOperator.apply("Ashmeet", "Tiwary"));

        System.out.println("IntBinaryOperator : "+sumOfTwoValueUsingBinaryOperator.applyAsInt(2,6));



    }
}
