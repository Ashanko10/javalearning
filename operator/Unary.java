package operator;
import java.util.Scanner;

public class Unary{
  public static void main(String[] args) {
    int var1, var2;
    Scanner scanner = new Scanner(System.in);

    System.out.print("masukkan nilai : ");
    var1 = scanner.nextInt();
    var2 = var1++; // masukkan nilai ke var2 dulu
                   // kemudian baru tambah (dalam
                   // hal ini var1)
    System.out.println(var1 +" "+ var2); //4 3
    System.out.print("masukkan nilai : ");

  }
}
