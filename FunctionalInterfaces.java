package com.company.practice;

@FunctionalInterface
interface Animal{
    void getAnimalSound();
}

@FunctionalInterface
interface Addition{
    float sum(float x, float y);
}

public class FunctionalInterfaces {

    public static void main(String[] args) {
      /*  Animal animal = ()->{
            System.out.println("Dog Barks");
        };
        animal.getAnimalSound();*/

        Addition addition= (x, y)->{
          return x+y  ;
        };
        System.out.println( addition.sum(10,20));
    }
}
