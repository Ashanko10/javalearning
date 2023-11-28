package usingPackage.mathPackage;

public class mathPackage {
  public int add(int a, int b) {
    return a + b;
  }
  public int subtract(int a, int b) {
    return a - b;
  }
  public long factorial(int num){ //example recursive function  
    if (num <= 1){
      return 1;
    }
    return num * factorial(num - 1 );
  }
  
}
