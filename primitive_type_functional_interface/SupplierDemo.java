package com.company.practice.primitive_type_functional_interface;

import java.util.function.IntSupplier;

public class SupplierDemo {
    public static void main(String[] args) {

        IntSupplier intSupplier= ()-> (int)(Math.random()*10);
        String otp="";
        for (int i=0; i<6; i++){
            otp +=intSupplier.getAsInt();
        }


        System.out.println("GENERATED OTP : "+otp);


    }
}
