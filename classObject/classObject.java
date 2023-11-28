package classObject;

import usingPackage.mathPackage.mathPackage;

class Student{  
  String name;
  int id;
  String major;
  void setName(String stName){
    name = stName;
  }
  void setMajor(String stMajor){
    major = stMajor;
  }
  void display(){
    System.out.println("nama murid "+name);
    System.out.println("jurusan "+major);
    System.out.println("id student "+id);
    System.out.println();
  }
}

public class classObject {
  public static void main(String[] args) {
    mathPackage mPackage = new mathPackage();
    Student s1, s2;
    s1 = new Student();
    s2 = new Student();

    s1.setName("andri");
    s1.setMajor("fisika");    
    s1.id = 123;

    s2.setName("Yudi");
    s2.setMajor("math");
    s2.id = 124;

    s1.display();
    s2.display();
    System.out.println(mPackage.add(12, 12));
  }
  
}

