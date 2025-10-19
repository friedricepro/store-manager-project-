public class Product {

private String name;
private double price;
private String tier;
/*
These instance variables will be used in the
Product.java superclass and will be inherited into every
subclass of Product.java to show represent basic information
 */
  
public Product(){
  this("No Item Selected", 0.0, "No item Selected");
}
/*
Sets default values
 */

  
public Product(String name, double price, String tier){
  this.name = name;
  this.price = price;
  this.tier = tier;
}
/*
Sets values based on user-input
 */

  
  public String getName(){
    return name;
  }
  public double getPrice(){
    return price;
  }
  public String getTier(){
    return tier;
  }
/*
Getter methods to return the current value
of variables and adds accessibility
 */

  
public void setName(String newName){
  name = newName;
}
public void setPrice(double newPrice){
  price = newPrice;
}
public void setTier(String newTier){
  tier = newTier;
}
/*
Setter methods to set variables values to updated values
 */

  
   public String toString() {
    return "Name: " + name + "\nPrice: " + price + " P$" + "\nTier: " + tier + "\n";
}
/*
Overrides to correctly display the output
 */

}
