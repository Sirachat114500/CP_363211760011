package Lab7;

import java.util.Scanner;

public class Rectangle_App {
    public static void main(String[] args) {

        //create object
        Rectangle rec1 = new Rectangle();
        rec1.setLength(20.0);
        rec1.setWidth(10.);

        System.out.println(rec1.getLength());
        System.out.println(rec1.getWidth());
        System.out.println(rec1.gatArea());

        Rectangle rec2 = new Rectangle(10.0,5);

        System.out.println(rec2.getLength());
        System.out.println(rec2.getWidth());
        System.out.println(rec2.gatArea());




    }//main

}//class
