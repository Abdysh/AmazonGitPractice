package com.digital_nomads.javaFall2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws Exception{

       // try {
         //   FileWriter myWriter = new FileWriter("filename.txt");
            //Scanner myReader = new Scanner((Readable) myWriter);
            //while (myReader.hasNextLine()){
           // myWriter.write("Files in Java might be tricky, but it is fun enough!");
           // myWriter.close();
           // System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally is ");

//            File myFile = new File("myFile.txt");
//            Scanner myReader = new Scanner(myFile);
//            System.out.println(myFile.getName());
//            while (myReader.hasNextLine()){
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e){
//            System.out.println("Error");
//            e.printStackTrace();
//        int a[] = new int[4];
//
//        throw new Exception("This is my exception");

        int age = 19;
        if (age < 18){
            throw new Exception("Access denied");
        } else {
            System.out.println("Access granted");
        }
        }
        public static boolean test (int[] b) throws Exception{
            int a[] = new int[b.length];
            return false;
    }
}
