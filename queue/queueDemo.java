package queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueDemo {
  public static void main(String[] args) {
    Queue<Integer> myQueue = new LinkedList<Integer>();
    myQueue.add(10);
    myQueue.add(20);
    myQueue.add(30);
    myQueue.add(40);
    myQueue.add(50);

    System.out.println("panjangnya : " + myQueue.size());
    System.out.println(myQueue);
    //liat yang index paling awal
    System.out.println("top element is : " + myQueue.peek());

    while(!myQueue.isEmpty()){
      System.out.println("the removed item is : " + myQueue.remove());
      //remove dari kiri
    }
  }
}
