package com.company.practice.biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {

        BiConsumer<String, String> getStringConcatenateValue= (name1, name2)-> System.out.println(name1+name2);

        getStringConcatenateValue.accept("Ashmeet","Tiwari");

    }
}
