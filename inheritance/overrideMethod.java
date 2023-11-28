package inheritance;

class Animal {
  public void movement(){
    System.out.println("Animal bisa bergerak");
  }
}

class Dog extends Animal{
  @Override
  public void movement(){
    System.out.println("Anjing juga bisa bergerak");
  }
}

class Frog extends Animal {
  @Override
  public void movement() {
    System.out.println("panggil parent");
    super.movement();
    System.out.println("Kodok bisa loncat");

  }
}

public class overrideMethod {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.movement();
    System.out.println();
    
    Dog animal1 = new Dog();
    animal1.movement(); // cm manggil method sendiri aja
    
    Frog animal2 = new Frog();
    System.out.println();
    animal2.movement(); // juga memanggil method parent
  }
  
}
