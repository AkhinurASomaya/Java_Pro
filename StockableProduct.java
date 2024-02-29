/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author Computer Solution
 */
public class StockableProduct extends Product implements Stockable{
private int numberofitemsstocked;

public StockableProduct(){
    super();
    

}

      public StockableProduct(int numberofitemsstocked, String name, int product, double price, String genre, int yearpublished, double discount) {
        super(name, product, price, genre, yearpublished, discount);
       this.numberofitemsstocked=numberofitemsstocked;
    
        
    }

    public int getNumberofitemsstocked() {
        return numberofitemsstocked;
    }
    public void setNumberofitemsstocked(int numberofitemsstocked) {
        this.numberofitemsstocked = numberofitemsstocked;
    }

    @Override
    public String toString() {
        return super.toString()+ "StockableProduct{" + "numberofitemsstocked=" + numberofitemsstocked + '}';
    }

    @Override
    public void addstock(int num) {
         numberofitemsstocked = numberofitemsstocked+num;
    }

    @Override
    public void removestock(int num) {
         numberofitemsstocked= numberofitemsstocked-num;
    }

    @Override
    public void editstock(int num) {
      numberofitemsstocked=num; 
    }

    @Override
    public String getInfo() {
        return "Name:"+getName()+" numberofitemsstocked:" +getNumberofitemsstocked();
    }
    
    
    
}
