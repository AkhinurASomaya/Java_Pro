/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {
   public static void main (String[] args){
	 Music m1 = new Music(40,"Girls like you ",1,110.20,"PopMusic",2017,5.50,"Maaroon5");//int numberofitemsstocked, String name, int product, double price, String genre, int yearpublished, double discount,String Artistname
         Music m2 = new Music(30,"See you Again",1,130.2,"",2017,2.02,"Wiz khalifa");
          
         movie mv1=new movie("Francis Ford Coppola",30,"The God Father",2,260.0,"Gangster",1972,4.5) ; 
	  movie mv2=new movie("Francis Ford Coppola",18,"Rumble Fish",2,160.0,"",1983,7.5) ; 
          
       Game g1= new Game("PUBG Corporation",28,"Player Unknown's BattleGround",3,88.9,"Battle Royale",2017,5.0);
       Game g2= new Game("Epic Games",18,"Fortnite",3,83.9,"",2017,4.0);//String Developer, int numberofitemsstocked, String name, int product, double price, String genre, int yearpublished, double discount
       Inventory items=new Inventory();
      items.addItem(m1);
      items.addItem(m2);
      items.addItem(mv1);
      items.addItem(mv2);
      items.addItem(g1);
      items.addItem(g2);
       
     System.out.println("Product list:");
      for(Product O:items){
          System.out.println(O);
      }
       List<Product> products = new ArrayList<Product>();
      Iterator<StockableProduct> iterator = items.iterator();
     
      while (iterator.hasNext()) {
   	   Product product = iterator.next();
   	   products.add(product);
      }
     
      Invoice invoice = new Invoice();
       invoice.addProduct(m1);
       invoice.addProduct(m2);
       invoice.addProduct(mv1);
       invoice.addProduct(mv2);
       invoice.addProduct(g1);
      System.out.println("\n"+invoice.getInvoice());
    
     Invoice n = new Invoice();
    
      n.addProduct(m1);
      n.addProduct(m2);
      n.addProduct(mv1);
      n.addProduct(mv2);
      n.addProduct(g1);
      n.addProduct(g2);
       System.out.print(n.getInvoice());
      
      
      System.out.println("\n");
      System.out.println("\n Available GAme:");
   for(Product product:products){
       if(product.getClass().getName()== "product.Game"){
           System.out.println("Class: Name: "+product.getName());
       }
   }
    ArrayList<Double> s =new ArrayList<>();
      System.out.println("Cheapest game:");
      for(Product product:products){
          if(product.getClass().getName()=="product.Game"){
              s.add(product.getPrice());
          }
              
      }
      for(Product product:products){
          if(product.getPrice()== Collections.min(s)){
              System.out.println(" Name:"+product.getName()+" Price:"+product.getPrice());
          
        }
      }
      System.out.println("Movies of Francis Ford Coppola:");
      for(Product product:products){
          if(product instanceof movie){
              movie mv= (movie)product;
              if(product.getClass().getName()=="product.movie"){
                  if(mv.getDIRECTOR()=="Francis Ford Coppola"){
                       System.out.println(product.getName());
                  }
              }
          }
      }
			
    String C="";
    for(Product product:products){
        if(product instanceof StockableProduct){
          if(product.getClass().getName()=="product.movie"){
                   String Store = "\nName: "+product.getName()+", Number Of AvailableStock: "+((StockableProduct) product).getNumberofitemsstocked();
                   C=C.concat(Store);
                }
                   if(product.getClass().getName()=="product.Music"){
                      String Store = "\nName:"+product.getName()+", Number Of AvailableStock:"+((StockableProduct) product).getNumberofitemsstocked();
                    C= C.concat(Store);
                }
                      if(product.getClass().getName()=="product.Game"){
                      String Store = "\nName:"+product.getName()+", Number Of AvailableStock:"+((StockableProduct) product).getNumberofitemsstocked();
                   C= C.concat(Store);
                }
           }
    }
    System.out.println("Currently Available NumberOfItemsStocked: " +C);
    
  }
}