import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Coffee c = new Coffee("large", true, 10, "latte");
    SpecialtyCoffee sp = new SpecialtyCoffee("small", false, 30, "machiatto", "matcha");

    System.out.println(c);
    System.out.print(sp);



    // Uncomment to test the Car classes
    // CarTester.run();

    // Uncomment to test the Company classes
    // CompanyTester.run();
  }
}
