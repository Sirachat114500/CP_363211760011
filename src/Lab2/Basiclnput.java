package Lab2;

import java.util.Scanner;

public class Basiclnput {

    public static void main (String[]  args){

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("What is you name? :");
        name = scanner.nextLine();
        System.out.println("You name is"+name);

        System.out.println("What is your major? : ");
        String major = scanner.nextLine();
        System.out.println("Your major is"+major);

        System.out.println("You is Age? : ");
        String Age = scanner.nextLine();
        System.out.println("Your is Age"+Age);

        System.out.println("You is Email? : ");
        String Email = scanner.nextLine();
        System.out.println("Your is Email"+Email);



        //Age
        //Email


    }




}//main
