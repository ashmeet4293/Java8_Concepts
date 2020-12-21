package com.company.practice.function;

import java.util.function.Function;

/**Program to remove spaces present in the given String by using Function:*/
public class ProgramToRemovespacesInGivenStringUsingFunction {
    public static void main(String[] args) {

        Function<String, String> function1= (stringValue)-> stringValue.replace(" ", "");
        System.out.println(function1.apply("Ashmeet Pawan Ram Sita"));

    }
}
