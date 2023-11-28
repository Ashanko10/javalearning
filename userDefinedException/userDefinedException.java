package userDefinedException;
// package exceptionDemo;
class BelowAgeException extends Exception{
  BelowAgeException(){
    super("Age is under 18");
  }
}

class Application {
  private String name;
  private String course;
  private int age;
  public Application(String name, String course) {
    this.name = name;
    this.course = course;
    age = 18;
  }
  public Application(){
    this("","");
  }
  public void setAge(int age) throws BelowAgeException{
    if (age < 18) 
      throw new BelowAgeException();
    else
      this.age = age;    
  }
  public void displayDetails() {
    System.out.println("nama murid : " + name);
    System.out.println("ambil jurusan apa : " + course );
    System.out.println("umurnya : "+ age);
    System.out.println();
  }  
}

public class userDefinedException {
  public static void main(String[] args) {
    Application application1 = new Application("Andri", "Computer Science");
    Application application2 = new Application("Yudi", "Physics");

    application1.displayDetails();

    try {
      application2.setAge(17); //this method may throw exception
    } catch (BelowAgeException e){
      System.out.println(e.getMessage());
      e.printStackTrace();;
    }
  }
}
