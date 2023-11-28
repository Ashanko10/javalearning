package switchCase;
import java.util.Scanner;

public class switchCase {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("masukkan karakternya : ");
    char character = scanner.next().toLowerCase().charAt(0);
    // lowercase hanya bisa digunakan di string, ketika diterapkan
    // pada char dia throw error

    switch (character) {
      case 'a':
        System.out.println("inputmu ada karakter a di indexs nolnya");
        break;

      case 'b':
        System.out.println("inputmu ada karakter b di indexs nolnya");
        break;

      case 'c':
        System.out.println("inputmu ada karakter c di indexs nolnya");
        break;
    
      default:
        System.out.println("inputmu selain karakter a, b dan c");
        break;
    }
    scanner.close();
    System.out.println("program is ending");
  }
}
