package stack;

import java.util.Stack;

public class stackDemo {
  public static void main(String[] args) {
    Stack<Integer> myStack = new Stack<>();
    //then push
    myStack.push(10);
    myStack.push(20);
    myStack.push(30);
    myStack.push(40);
    myStack.push(50);

    //iseng kopi
    Stack<Integer> myStack2 = new Stack<>(); //bikin
    myStack2.addAll(myStack); //kopi semua ke stack2

    System.out.println("panjang stacknya : " + myStack.size());
    System.out.println(myStack);
    System.out.println(myStack.peek());
    while (myStack.size() > 0){
      System.out.println("item yang kena pop : " + myStack.pop()); 
                                   //diremove 1 persatu dari kanan
    }
    System.out.println("iklan ...............................................");
    // loop yang basically melakukan hal yang sama tapi karena myStack habis
    // kita pake myStack2
    while (!myStack2.isEmpty()){
      System.out.println("item yang kena pop : " + myStack2.pop()); 
                                   //diremove 1 persatu dari kanan
    }
  }
  
}
