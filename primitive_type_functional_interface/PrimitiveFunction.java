package com.company.practice.primitive_type_functional_interface;

import java.util.function.IntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunction {

    public static void main(String[] args) {
        IntFunction<Integer> cubeFunction = (value)-> (value*value*value);

        /*For different input and return type*/
        ToIntFunction<String> stringLengthFunction= value -> value.length();
        ToDoubleFunction<Integer> getSquareRootOfIntegerFunction = value -> Math.sqrt(value);


        System.out.println("Cube "+cubeFunction.apply(20));
        System.out.println("String Lenght : "+stringLengthFunction.applyAsInt("Ashmeet"));
        System.out.println("Square Root Function : "+getSquareRootOfIntegerFunction.applyAsDouble(24));
    }
}
