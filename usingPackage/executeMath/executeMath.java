package usingPackage.executeMath;

import usingPackage.mathPackage.mathPackage;

public class executeMath {
  public static void main(String[] args) {
    mathPackage mPackage = new mathPackage();
    System.out.println(mPackage.add(12, 12));
    System.out.println(mPackage.subtract(12, 5));
  }
  
}
