package com.company.practice.supplier;

import java.util.function.Supplier;

public class ProgramToNameByUsingSupplier {
    public static void main(String[] args) {


        Supplier<String> randomNameSupplier = ()->{
            String [] names = {"Sunny"," Bunny","Chinny", "Vinny"};
            int x = (int) (Math.random()*4);
            return names[x];
        };

        System.out.println(randomNameSupplier.get());


    }
}
