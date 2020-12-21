package com.company.practice.default_and_static_method_in_interface;

interface  Mammal1{

    /*It cannot be overriden on child classes*/
    static void getMamalMeaning(){
        System.out.println("a warm-blooded vertebrate animal of a class that is distinguished by the possession of hair or fur," +
                " females that secrete milk for the nourishment of the young, and (typically) the birth of live young.");
    }
}
class Bat1 implements Mammal1 {
    void printNoOfLegs() {
        System.out.println("Two Legs");
    }
    /*
    * Here it is new Method with same method name and return value
    * which means it is not overriden from the interface
    */
    public void getMamalMeaning(){
        System.out.println("Bat is also a Mammal");
    }
}

public class StaticMethodInterface {

    public static void main(String[] args) {

        /*To call the static method of interface we use InterfaceName only*/
        Mammal1.getMamalMeaning();

        Bat1 bat=new Bat1();
        bat.printNoOfLegs();
        bat.getMamalMeaning();


    }
}
