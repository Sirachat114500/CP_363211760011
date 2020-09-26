package Lab5;

import java.util.Scanner;

public class BasicArray2D {
    public static void main(String[] args) {

        int number [] [] = new int[2][3]; //2*3 = 6 blocks
        //in put data to array 2D
        number = inputdata (number);







    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pleaes ,input integers to array 2D:");
        for (int i = 0; i<number.length; i++) {   //row
            for (int j = 0; j < number[i].length; j++) {//column
                System.out.print("number[" + i + "][" + j + "]: ");//number [0] [0]:


    }

    private static int[][] inputdata(int[][] number) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pleaes ,input integers to array 2D:");
        for (int i = 0; i<number.length; i++) {   //row
            for (int j = 0; j < number[i].length; j++) {//column
                System.out.print("number[" + i + "][" + j + "]: ");//number [0] [0]:
                number[i][j] = sc.nextInt();



            }
            return number;

        }











    }
}
