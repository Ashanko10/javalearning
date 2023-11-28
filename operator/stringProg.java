package operator;
import java.util.Scanner;

public class stringProg{
  public static void main(String[] args) {
    char[] charString = {'S', 't', 'r', 'i', 'n', 'g'};
    Scanner scanner = new Scanner(System.in);
    String str = new String(charString);        
    System.out.println("initial value of str is : "+ str);    

    System.out.print("insert your string : ");
    str = scanner.next(); // dapatkan string dari user
    System.out.println("your inserted string is " + str );  
  }
}
