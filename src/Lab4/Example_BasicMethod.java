package Lab4;

public class Example_BasicMethod {

    public static void B (int num) {
        
        //Statement
        System.out.println("Hello B."+num);
        
        
    }//B
    
    
    public static void main(String[] args) {
        System.out.println("Hello Main.");
        //call A()
        A();
        A();
        A();
        B(100);


    }//main

  public static void A (){
        //Statement
      System.out.println("Hello A.");
  }//A


}//class
