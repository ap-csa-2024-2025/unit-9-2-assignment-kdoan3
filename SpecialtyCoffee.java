public class SpecialtyCoffee extends Coffee
{
  private String flavor;

  public SpecialtyCoffee()
  {
    super();
    flavor = "vanilla";
  }

  public SpecialtyCoffee(String type, String flavor)
  {
    super("small", false, 1, type);
    this.flavor = flavor;
  }

  public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
  {
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }

  // Method override of Coffee getPrice
  //return 1.5x the regular coffee price
  public double getPrice()
  {
    return super.getPrice() * 1.5;
  }

  // Method override of Coffee toString
  public String toString()
  {
    // we will edit in class
    return null;
  }

  // print a message that compares the prices of a regular Coffee
  // and a SpecialtyCoffee using both getPrice methods
  public void printPriceComparison()
  {
    System.out.println("A regular coffee costs " + super.getPrice());
    System.out.println("Thiscoffee costs " + this.getPrice(););
    System.out.println("This coffee costs " getPrice());
  }
}
