package com.company.practice.anonymous_inner_class;

interface SampleInterface{
    void method1();
}

public class AnonymousInnerClassAndThisOperator{

    private int x=1000;

    void method2(){
         int y=20;

         SampleInterface sampleInterface=()->{
            int x=2000;
//            y=24;  // This cannot be done. because the local variable which is reference from lambda expression are final variable.
            System.out.println("Anonymous Inner Class variable `x` value : "+x); // this referst to the inner class method level variable : o/p : 2000
            System.out.println("Outer class instance variable `x` value :  "+this.x); //This refers to the outer class instance variable : o/p : 1000
            System.out.println("Method level varibale `Y` : "+y);
        };
        sampleInterface.method1();
    }


    public static void main(String[] args) {

        AnonymousInnerClassAndThisOperator anonymousInnerClassAndThisOperator=new AnonymousInnerClassAndThisOperator();
        anonymousInnerClassAndThisOperator.method2();

    }

}
