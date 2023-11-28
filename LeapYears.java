
import static java.time.Year.of;

public class LeapYears {
  public static boolean isLeapYear(int year) {
    boolean result = of(year).isLeap();
    return result;
  }
  public static void main(String[] args) {
    LeapYears leapYears = new LeapYears(); // aga unik pake di paling bawah
    boolean result = leapYears.isLeapYear(2014);
    System.out.println(isLeapYear(2013));
    System.out.println(isLeapYear(2004));
    System.out.println(isLeapYear(4000));
    System.out.println(isLeapYear(3000));

    // disini pake leapYears kecil
    System.out.println("yang ini pake new, terus dipanggil pake titik fungsinya");
    System.out.println(result);
  }
}
