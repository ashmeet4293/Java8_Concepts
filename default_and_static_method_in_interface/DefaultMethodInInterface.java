package com.company.practice.default_and_static_method_in_interface;

interface  Mammal{
    default void printNoOfLegs(){
        System.out.println("Most of the Mammals have Four Legs");
    }
}
class Bat implements  Mammal{
    @Override
    public void printNoOfLegs(){
        System.out.println("Bats have Two Legs");
    }
}
class Cow implements Mammal{

}

public class DefaultMethodInInterface {

    public static void main(String[] args) {


        Bat bat= new Bat();
        /* We get value from overridden default method */
        bat.printNoOfLegs();

        Cow cow= new Cow();
        /* We get value from the parent interface*/
        cow.printNoOfLegs();

    }
}
