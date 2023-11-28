package arrays;

import java.util.Scanner;

public class arrays {
  public static void main(String[] args) {
    int[] intArr = {10,20,30,40,50}; // 5 values secara langsung disimpan disini
    float[] floatArr = new float[5]; // float type save 5 char
    char charArr[] = new char[5]; // store 5 elements

    Scanner sc = new Scanner(System.in);

    // manual assign float, 5 float values to floatArr
    floatArr[0] = 0.1F;
    floatArr[1] = 0.2F;
    floatArr[2] = 0.33F;
    floatArr[3] = 0.23F;
    floatArr[4] = 1.24F;

    // menggunakan loop untuk isi satu2 char ke intArr
    for(int i = 0; i < 5; i++) {
      System.out.print("masukkan input string : ");
      charArr[i] = sc.next().charAt(0);
    }

    // menunjukkan isi intArr;
    for (int i = 0; i < 5; i++){
      if(i == 0) {
        System.out.println("isi dari intArr atau array integer adalah");
      }
      System.out.println(intArr[i]);
    }
    // menunjukkan isi floatArr, menggunakan for items
    System.out.println("isi dari floatArr adalah : ");
    for(float item: floatArr){
      System.out.println(item);
    }
    // menunjukkan isi charArr
    System.out.println("isi dari charArr adalah : ");
    for(char item: charArr) {
      System.out.println(item);
    }
  }
  
}
