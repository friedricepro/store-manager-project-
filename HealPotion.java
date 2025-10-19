public class HealPotion extends Product{

//Inherits from Product
  
  private int healAmount;

//Instance variable store healAmount value
  
  public HealPotion() {
    healAmount = 0;
  }

//Sets default value for healAmount
  
public HealPotion(String name, double price, String tier, int healAmount){
  super(name, price, tier);
  this.healAmount = healAmount;
}

//Sets value for healAmount based on user input
  
public int getHealAmount(){
  return healAmount;
}

//Accessor method that returns the current value of healAmount
  
public void setHealAmount(int newHealAmount){
  healAmount = newHealAmount;
}

//Setter method used to set the value of healAmount to the updated value
  
public String toString(){
  return super.toString() + "This Item Heals " + healAmount + " HP" + "\n";
}

  //Overrides to print out the correct output
}
