package Lab6;

import java.util.StringTokenizer;

public class Ex_StrToken {

    public static void main(String[] args) {

        String msg = "World War II (WWII or WW2), also known as the Second World War, was a global war that lasted from 1939 to 1945. It involved the vast majority of the world's countries—including all the great powers";

        System.out.println(msg.length());

        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens()); // return word count as integer

        while (myToken.hasMoreTokens())
            System.out.println(myToken.nextToken());





    }
}
