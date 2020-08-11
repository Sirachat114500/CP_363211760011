package Exersice;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Exercise_Lab2_2 {

    public static void main(String[] args) {

        // 0.5 * base * height
        Scanner in = new Scanner(System.in);
        System.out.print("input base:");
        double base = in.nextDouble();
        System.out.print("input height:");
        double height = in.nextDouble();

        double area = 0.5 * base * height;
        System.out.print("Area is:"+area);

    }












}
