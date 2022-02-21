package com.digital_nomads.javaFall2021.exceptions;

public class Exceptions {
    public static void main(String[] args) {

        try {
            int a[] = new int[3];
            System.out.println(a[10]);

        } catch (ArrayIndexOutOfBoundsException e){  // catch (Exception e){
            e.printStackTrace();
            System.err.println("An error occurred");
        }
        System.out.println("Hello");
    }
    // 1)
}
