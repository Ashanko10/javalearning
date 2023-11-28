package function;

public class overloadMethod {
  public static void area(int x, int y){ // square area
    System.out.println( x * y );
  }

  public static void area(double x){ //circle area
    System.out.println( x * 3.14 );
  }

  public static void area(float x, float y){ // triangle area
    System.out.println( x * y * 0.5) ;
  }

  public static void main(String[] args) {
    area(2,3);
    area(2D);
    area(2F, 2F);
  }  
}
