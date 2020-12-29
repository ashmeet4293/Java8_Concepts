package com.company.practice.primitive_type_functional_interface;

import java.util.function.DoubleUnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {

        DoubleUnaryOperator cubeValue= (x)-> x*x*x;

        System.out.println(cubeValue.applyAsDouble(22.0));

    }
}
