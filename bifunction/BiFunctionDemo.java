package com.company.practice.bifunction;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Double,Double, Double> productFunction=(x, y)-> x*y;

        System.out.println(productFunction.apply(20.0,30.0));
    }
}
