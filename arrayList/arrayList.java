package arrayList;
import java.util.ArrayList;

public class arrayList {
  public static void main(String[] args) {
    ArrayList<String> kotaDaftar = new ArrayList<>();
    kotaDaftar.add("yogyakarta");
    kotaDaftar.add("bandung");
    kotaDaftar.add("surabaya");
    kotaDaftar.add("pontianak");

    System.out.println("panjang arraylist kotaDaftar adalah : " + kotaDaftar.size());
    System.out.println("isinya : "+ kotaDaftar);
    // loop isinya
    for(String item: kotaDaftar){
      System.out.println(item);
    }
    // nambah di index kedua (menjadi 1 karena index dimulai dari nol)
    kotaDaftar.add(1, "new york");
    System.out.println("isinya : "+ kotaDaftar);
    for(String item: kotaDaftar){
      System.out.println(item);
    }
  }
  
}
// assign, panjang array, loop arraylist, nambah di index kedua,uabah array list
