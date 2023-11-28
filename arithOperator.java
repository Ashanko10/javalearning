// penggunaan yang sangat baik dalam hal tersebut
// dalam penggunaan yang akan saya tunjukan kali ini sebuah hal yang sangat aneh
// bila dalam penerapan fungsi java halnya berubah menjadi tabu
import java.util.Scanner;
public class arithOperator{
  public static void main(String[] args) {
    int a, b, result;
    Scanner scanner = new Scanner(System.in);

    System.out.print("masukkan nilai a dan b : ");
    a = scanner.nextInt();
    b = scanner.nextInt();

    result = a + b;
    System.out.print("nilai tambah "+ result +"\n");
    result = a - b;
    System.out.print("nilai kurang "+ result+"\n");
    result = a * b;
    System.out.print("nilai kali "+ result+"\n");
    result = a / b;
    System.out.print("nilai bagi "+ result+"\n");
    result = a % b;
    System.out.print("nilai sisa "+ result+"\n");

  }
}