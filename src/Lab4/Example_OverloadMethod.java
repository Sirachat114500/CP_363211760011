package Lab4;

public class Example_OverloadMethod {

    public static void main(String[] args) {

        int max = max( x: 5, y: 10 );
        double max2 = max(x: 5.0, y: 10.0) ;


    }//main
    public static int max (int x,int y) {
        return x>y? x:y;
        //if (x>y) return x;
        //else return y;

    }
    public static double max (double x,double y) {
        return x > y ? x : y;
        //if ( x>y ) return x;
        //else return y;
    }
}//class
