package Lab2;

public class MyVariable {

    public static void main(String[] args) {

        //integer จำนวนเต็ม เช่น 10 0 -10
        int x; //ประกาศตัวแปรชื่อ x สำหรับเก็บข้อมูลจำนวนเต็ม
        x = 10; // กำหนดให้ตัวแปร x มีค่าเท่ากับ 10
        System.out.println("x = "+x);
        int y = 20; //ประกาศตัวแปรชื่อ y และกำหนดค่าให้เท่ากับ 20
        System.out.println("y ="+y);
        System.out.println("x+y ="+(x+y)); // x+y = 30

        //real number จำนวนจริง เช่น 10.00 -555.36 78.21
        float f = 10.10f;
        System.out.println((f));
        double d = 45;
        System.out.println(d);

        //character ตัวอักษรเพียง 1 ตัวเท่านั้น เช่น # $ % A a
        char c = 'C';
        System.out.println(c);

        //boolean เก็บค่า true (1) และ false (0)
        boolean b = true;
        System.out.println(b);
        System.out.println(!b);

        //String เป็นคลาสในภาษา Java ใช้สำหรับเก็บข้อมูลชนิด  ข้อความ
        String S = "Management Technology";

        System.out.println(S);
        System.out.println(S.length()); //คืนค่ากลับมาเป็น จำนวนเต็ม
        System.out.println(S.toUpperCase()); //แปลงอักขระเป็นพิมพ์ใหญ่
        System.out.println(S.toLowerCase()); //แปลงอักขระเป็นพิมพ์เล็ก
        System.out.println(S.charAt(5));   //แปลงอักขระเป็นพิมพ์เล็ก


    }//main







}
