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
public class Game extends StockableProduct {
    private String Developer;

    public Game(String Developer, int numberofitemsstocked, String name, int product, double price, String genre, int yearpublished, double discount) {
        super(numberofitemsstocked, name, product, price, genre, yearpublished, discount);
        this.Developer = Developer;
    }

    public String getDeveloper() {
        return Developer;
    }

    public void setDeveloper(String Developer) {
        this.Developer = Developer;
    }

    @Override
    public String toString() {
        return super.toString()+"Game{" + "Developer=" + Developer + '}';
    }

    @Override
    public String getInfo() {
        return "Name:"+getName()+"Catagory:Game"+"Developer:"+getDeveloper()+"NumberofitemsStock:"+getNumberofitemsstocked();
    }
    
    
}
