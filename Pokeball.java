public class Pokeball extends Product {

  //Inherits from Product
  
private double catchRate;

  //Sets instance variable for the catch rate

  public Pokeball() {
    catchRate = 0.0;
  }

//Sets default value for catch rate
  
public Pokeball(String name, double price, String tier, double catchRate){
  super(name, price, tier);
  this.catchRate = catchRate;
}

  //Sets values based on user inputs

public double getCatchRate(){
  return catchRate;
}

//Accessor method that returns the current value of catchRate
  
  public void setCatchRate(double newCatchRate){
    catchRate = newCatchRate;
  }

//Sets the value of the catchRate variable to the update value
  
  public String toString(){
    return super.toString() + "Catch Rate: " + catchRate + "%" + "\n";
  }

  //Overrides to print out the correct output
}
