package sets;

import java.util.HashSet;
import java.util.Set;

public class setDemo {
  public static void main(String[] args) {
    int[] list1 = {1, 2, 3, 5 ,4, 5 };
    int[] list2 = {2, 4, 6, 8, 10, 12};
  
    Set<Integer> set1 = new HashSet<Integer>();
    Set<Integer> set2 = new HashSet<Integer>();
  
    for (int item:list1){
      set1.add(item);
    }
  
    for (int item:list2){
      set2.add(item);
    }    
    System.out.println("set 1 adalah : " + set1 );
    System.out.println("set 2 adalah : " + set2);

    Set<Integer> union = new HashSet<Integer>(set1);
    union.addAll(set2);
    System.out.println("union adalah : " + union);

    Set<Integer> intersection = new HashSet<Integer>(set2);
    intersection.retainAll(set1); //sisain yang sama di set 1 dan 2 
    System.out.println("intersection adalah : " + intersection);

    Set<Integer> diff = new HashSet<Integer>(set1);
    diff.removeAll(set2); //ada yang sama di set 1 dan set 2? hapus keduanya
    System.out.println("yang ga sama di dua set : "+ diff);
  }
}
