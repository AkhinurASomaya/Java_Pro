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
public abstract class Product {
    private String name;
    private int product;
    private double price;
    private String genre;
    private int yearpublished;
    private double discount;
    public Product(){
        
    }
    public Product(String name,int product,double price,String genre,int yearpublished,double discount){
        this.discount=discount;
        this.genre=genre;
                this.name=name;
                        this.price=price;
                                this.product=product;
                                        this.yearpublished=yearpublished;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }  

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearpublished() {
        return yearpublished;
    }

    public void setYearpublished(int yearpublished) {
        this.yearpublished = yearpublished;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public abstract String getInfo();
    

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", product=" + product + ", price=" + price + ", genre=" + genre + ", yearpublished=" + yearpublished + ", discount=" + discount + '}';
    }
    
    
    
}
