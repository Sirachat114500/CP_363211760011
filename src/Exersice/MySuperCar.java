package Exersice;

import java.util.ArrayList;
import java.util.Scanner;


public class MySuperCar {

    public static void main(String[] args) {

        ArrayList<SuperCar> mySuperCar = new ArrayList<SuperCar>();
        Scanner SC = new Scanner(System.in);

        System.out.println("Which class car?: ");
        int class_car = SC.nextInt();

        //input data
        mySuperCar = inputData(mySuperCar, class_car);

        //display data
        displayData(mySuperCar);


    }//main

    private static void displayData(ArrayList<SuperCar> mySuperCar) {
        System.out.println("Data object below: ");
        for (SuperCar car : mySuperCar){

            System.out.println(car.getSuperCarInfo());



        }

    }

    private static ArrayList<SuperCar> inputData(ArrayList<SuperCar> mySuperCar, int class_car) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter class car info below: ");
        for (int i = 0; i < class_car; i++) {
        System.out.println("Enter car_brand: ");
        String car_brand = sc.nextLine();
        System.out.println("Enter car_color: ");
        String car_color = sc.nextLine();
        System.out.println("Enter car_engine_size: ");
        String car_engine_size = sc.nextLine();
        System.out.println("Enter max_speed: ");
        String max_speed = sc.nextLine();
        System.out.println("Enter country_of_origin: ");
        String country_of_origin = sc.nextLine();
        System.out.println("Enter:SuperCar_Class ");
        String SuperCar_Class = sc.nextLine();

        mySuperCar.add(new SuperCar(car_brand, car_color, car_engine_size, max_speed, country_of_origin, Integer.parseInt(SuperCar_Class)));

    }
    return mySuperCar;
}
}//class
