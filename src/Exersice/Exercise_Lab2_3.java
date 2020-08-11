package Exersice;

import java.util.Scanner;

public class Exercise_Lab2_3 {
    //global variablle
    public  static  final double PI = 3.141;

    public static void main(String[] args) {

        // 4/3 * Pi * r^3(รับค่า r จากผู้ใช้ )

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter radius of circle:");
        double r = Scanner.nextDouble();

        double v = (4/3) * PI * r * r * r;

        System.out.println("the capacity of circle :"+v);





    }
}
