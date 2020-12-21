package com.company.practice;



public class LambdaWithRunnableInterface {
    public static void main(String[] args) {
        Runnable runnable= ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Tread "+i);
            }
        };
        Thread thread= new Thread(runnable);
        thread.start();
        System.out.println("Main Thread");
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Tread "+i);
        }
    }
}
