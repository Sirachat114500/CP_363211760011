package Lab3;

import java.util.Scanner;

//รับค่าจำนวนเต็มจากผู้ใช้ เมื่อผู่ใช้ใส่ค่า 0 ให้จบการทำงาน (while)
public class Example_While {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
         int num = 1;

         while (num !=0){
             System.out.println("Enter integer :");
             num = SC.nextInt();

         }
        System.out.println("End.Good bye.");










    }//main
}//class
