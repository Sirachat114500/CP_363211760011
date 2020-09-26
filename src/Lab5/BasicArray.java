package Lab5;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {

        int[]number ;
        number = new int[5];// 5 blocks index = 0-4
        //display data in array
        displayArray(number);

        number[0] = 100;
        number[1] = 200;
        number[2] = 300;
        number[3] = 400;
        number[4] = 500;
        displayArray(number);

        ///input data array
        number = inputArray(number)


    }//main
    private static int [] inputArray(int [] number){
        System.out.print("Please, input data to array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< number.length; i++);{
            System.out.print("number ["+i+"]:");
            number {i} = sc.nextInt();
            return number;

        }
    }

    private static void displayArray(int[] number) {
        System.out.print("Data in array");
        for (int val :number) {
            System.out.print(Val+" ");

        }



    }

}//class
