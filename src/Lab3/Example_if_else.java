package Lab3;

import java.util.Scanner;

public class Example_if_else {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter integer 1:");
        int x = SC.nextInt();
        System.out.println("Enter integer 2:");
        int y = SC.nextInt();

        //condition
        if (x > y) {

            System.out.println(x+"grater than"+y);
        }else {
            System.out.println(x+"less than"+y);
        }
        System.out.println("Good bye");








    }//main
}//class
