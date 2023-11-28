package vectorDemo;

import java.util.Vector;

public class vectorDemo {
  public static void main(String[] args) {
    Vector<Integer> numVector = new Vector<Integer>();

    numVector.add(100);
    numVector.add(200);
    numVector.add(300);
    numVector.add(400);
    numVector.add(500);

    System.out.println("panjang numVector "+numVector.size());
    System.out.println("isinya "+numVector);
    System.out.println("tampilkan menggunakan looping");
    for(Integer item: numVector){
      System.out.println(item);
    }
    numVector.add(1,1000);
    System.out.println("isinya setelah tambah value di idx 1 " + numVector
                      + " panjangnya menjadi " + numVector.size());
  }
}
