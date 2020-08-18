package Lab3;

import java.util.Scanner;

public class Example_Switch_case {

    public static void main(String[] args) {

        //Switch-case นิยมใช้กับตัวแปลชนิด int หรือ char
        Scanner SC = new Scanner(System.in);
        System.out.println("What is your favorite food?");
        System.out.println("1 KFC");
        System.out.println("2 Pizza");
        System.out.println("3as MK");
        System.out.println("Select:");
        int S = SC.nextInt();


        //test variable
        switch (S) {

            case 1:System.out.println("I Iove KFC too.");
            break;
            case 2:System.out.println("I getting fat because I ate pizza a lot.");
            break;
            case 3:System.out.println("It pretty expensive for me.");
            break;
            default:System.out.println("Please,select 1-3. ");

            System.out.println("Good Bye");




        }









    }// main
}//Class
