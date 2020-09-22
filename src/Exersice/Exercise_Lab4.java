package Exersice;

import java.util.Scanner;

public class Exercise_Lab4 {

    public static  final double PI = 3.141;


    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        //display menu

        System.out.println("Please, Select options below: ");
        System.out.println("1.Find area of Triangle");
        System.out.println("2.Find area of Cone");
        System.out.println("3.Find area of Circle");
        System.out.println("4.Find area of Exit");
        System.out.print("Select:");
        int select = SC.nextInt();


        //switch-case
        switch (select){
            case 1:
                System.out.print("Enter base:");
                double b = SC.nextDouble();
                System.out.print("Enter high: ");
                double h = SC.nextDouble();
                double area = findArea(b, h);
                System.out.print("The area of Triangle :"+area);
                break;
            case 2:break;
            case 3:break;
            case 4:System.exit(i:1) ; break;
            default:System.out.print("Please, select number 1-4.");
        }


    }
    //triangle

    public static double findArea (Double b, double h){

        return 0.5 * b * h;

    }
    //Cone
    public  static  double findAreaCone(double r, double l){
        return (PI * r * l) + (PI * r * r);

    }
    //Circle
    public static double findArea (double r){
        return 2 * PI * r;



    }



}



