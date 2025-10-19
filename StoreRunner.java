import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
    
Product NoProduct = new Product();
 System.out.println(NoProduct);
 
Product DragonDance = new Product("TM100", 1000.0, "Legendary");
 System.out.println(DragonDance);
   
Product StarterGift = new Product("Starter Gift!",1.1,"Special");
 System.out.println(StarterGift);
/*
These products demonstrate a range of products and prints them
out such as no product, a legendary product, and a special product
 */

   
  Pokeball NoPokeball = new Pokeball();
  System.out.println(NoPokeball);
   
  Pokeball UltraBall = new Pokeball("UltraBall", 700.0, "Rare", 33.0);
  System.out.println(UltraBall);

 Pokeball Masterball = new Pokeball("Masterball", 300000.0,"Special", 100.0);
  System.out.println(Masterball);
/*
These pokeballs represent a range of pokeballs that
extend product and prints out different results
 */


  HealPotion NoPotion = new HealPotion();
  System.out.println(NoPotion);

  HealPotion SuperPotion = new HealPotion("Super Potion", 300.0, "Uncommon", 50);
  System.out.println(SuperPotion);

  HealPotion SodaPop = new HealPotion("Soda Pop", 500.0, "Unique",60);
  System.out.println(SodaPop);
/*
These heal potions represent a range of heal potions that
extend product and prints out different results
 */

  }
}
