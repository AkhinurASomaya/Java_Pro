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
public class movie extends StockableProduct{
    private String DIRECTOR;

    public movie() {
    }

    public movie(String DIRECTOR, int numberofitemsstocked, String name, int product, double price, String genre, int yearpublished, double discount) {
        super(numberofitemsstocked, name, product, price, genre, yearpublished, discount);
        this.DIRECTOR = DIRECTOR;
    }

    public String getDIRECTOR() {
        return DIRECTOR;
    }

    public void setDIRECTOR(String DIRECTOR) {
        this.DIRECTOR = DIRECTOR;
    }

    @Override
    public String toString() {
        return super.toString()+ "movie{" + "DIRECTOR=" + DIRECTOR + '}';
    }

    @Override
    public String getInfo() {
        return "name{"+ getName()+"Catagory:movie"+"Director"+getDIRECTOR()+"Numerofitemstock:" +getNumberofitemsstocked(); 
    }


}
