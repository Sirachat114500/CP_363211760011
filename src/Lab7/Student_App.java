package Lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_App {

    public static void main(String[] args) {

        ArrayList<Student> mySted = new ArrayList<>();
        Scanner SC = new Scanner(System.in);

        System.out.println("How many student?: ");
        int num_std = SC.nextInt();

        //input data
        mySted = inputData (mySted, num_std);

        //display data
        displayData(mySted);



    }//main

    private static void displayData(ArrayList<Student> mySted) {
        System.out.println("Data object below: ");
        for (Student std:mySted){
            System.out.println(std.toString());

        }

    }

    private static ArrayList<Student> inputData(ArrayList<Student> mySted, int num_std) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter student info below: ");

        for (int i = 0; i<num_std ; i++){
            System.out.println("Enter student name: ");
            String name = sc.nextLine();
            System.out.println("Enter student id: ");
            String id = sc.nextLine();
            System.out.println("Enter student level: ");
            String level = sc.nextLine();
            System.out.println("Enter student age: ");
            String age = sc.nextLine();

            mySted.add(new Student(name,id,level,Integer.parseInt(age)));

        }
        return mySted;


    }
}//class
