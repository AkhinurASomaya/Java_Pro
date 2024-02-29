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
public class Music extends StockableProduct {
    private String Artistname;

    public Music() {
    }

    public Music(int numberofitemsstocked, String name, int product, double price, String genre, int yearpublished, double discount,String Artistname) {
        super(numberofitemsstocked, name, product, price, genre, yearpublished, discount);
        this.Artistname=Artistname;
    }

    public String getArtistname() {
        return Artistname;
    }

    public void setArtistname(String Artistname) {
        this.Artistname = Artistname;
    }

    @Override
    public String toString() {
        return super.toString()+"Music{" + "Artistname=" + Artistname + '}';
    }

    @Override
    public String getInfo() {
        return "Name:"+getName()+"Catagory:Music"+"ArtistName: "+getArtistname()+"NumberofStock:"+getNumberofitemsstocked();
    }
    
    
}
