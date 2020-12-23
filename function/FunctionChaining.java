package com.company.practice.function;

import java.util.function.Function;

/** Function Chaining */
public class FunctionChaining {
    public static void main(String[] args) {

        Function<String, String> upperCaseFunction = s-> s.toUpperCase();
        Function<String, String> stringTrimingToSevenCharcters = s-> s.substring(0, 7);

        System.out.println("Upppercase VAlue : "+upperCaseFunction.apply("Ashmeet Tiwari"));
        System.out.println("String Triming with Seven Characters Function VAlue : "+stringTrimingToSevenCharcters.apply("Ashmeet Tiwari"));
        System.out.println("The result of f1 andThen f2 : "+upperCaseFunction.andThen(stringTrimingToSevenCharcters).apply("Ashmeet Tiwari"));

        System.out.println("_____________________________________ ANOTHER EXAMPLE FUNCTION CHAINING ______________________________________");

        Function<Integer, Integer> sumFunction = val-> val+val;
        Function<Integer, Integer> cubeFunction =  val-> val*val*val;

        System.out.println("Sum Function  : "+sumFunction.apply(2));
        System.out.println("Cube Function : "+cubeFunction.apply(2));
        /* sum function will run first and then cube function will run for provided value i.e. 2 */
        System.out.println("The result of f1 andThen f2 : "+sumFunction.andThen(cubeFunction).apply(2));
        /* sum function will run first and then cube function will run for provided value i.e. 2 */
        System.out.println("The result of f2 andThen f1 : "+sumFunction.compose(cubeFunction).apply(2));

    }
}
