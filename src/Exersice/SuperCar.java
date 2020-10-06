package Exersice;

public class SuperCar {

    //attributes
    private String car_brand;
    private String car_color;
    private String car_engine_size;
    private String max_speed;
    private String country_of_origin;
    private int SuperCar_Class;

    //constructor

    public SuperCar(String car_brand, String car_color, String car_enging_size, String max_speed, String country_of_origin, int superCar_Class) {
        this.car_brand = car_brand;
        this.car_color = car_color;
        this.car_engine_size = car_enging_size;
        this.max_speed = max_speed;
        this.country_of_origin = country_of_origin;
        SuperCar_Class = superCar_Class;
    }


    //getter and setter

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    public String getCar_enging_size() {
        return car_engine_size;
    }

    public void setCar_enging_size(String car_enging_size) {
        this.car_engine_size = car_enging_size;
    }

    public String getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(String max_speed) {
        this.max_speed = max_speed;
    }

    public String getCountry_of_origin() {
        return country_of_origin;
    }

    public void setCountry_of_origin(String country_of_origin) {
        this.country_of_origin = country_of_origin;
    }

    public int getSuperCar_Class() {
        return SuperCar_Class;
    }

    public void setSuperCar_Class(int superCar_Class) {
        SuperCar_Class = superCar_Class;
    }

    //toString

    public String getSuperCarInfo(){
        return "Exercise_Lab7{" +
                "car_brand='" + car_brand + '\'' +
                ", car_color='" + car_color + '\'' +
                ", car_enging_size='" + car_engine_size + '\'' +
                ", max_speed='" + max_speed + '\'' +
                ", country_of_origin='" + country_of_origin + '\'' +
                ", SuperCar_Class=" + SuperCar_Class +
                '}';
    }

}

