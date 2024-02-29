 /*To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author Computer Solution
 */
public class Invoice {
	private List<Product> products;
	private LocalDateTime date;

	public Invoice() {
		products = new ArrayList<Product>();
                date = LocalDateTime.now();
	}

	public Invoice(List<Product> products, LocalDateTime date) {
		this.products = products;
		this.date = date;
	}
	
	public LocalDateTime getLocalDateTime() {
		return date;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}

	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	private double calculatePriceWithoutDiscount() {
		double price = 0.0;
		
		for (Product product : products) {
			price += product.getPrice();
		}
		
		return price;
	}
	
	private boolean isFullHouseDiscountAvailable() {
            int Count1=0;
            int Count2=0;
            int Count3=0;
            for(Product product:products){
                if(product.getClass().getName()=="product.movie"){
                    Count1++;
                }
                                   if(product.getClass().getName()=="product.Music"){
                    Count2++;
                }
                      if(product.getClass().getName()=="product.Game"){
                    Count3++;
                }
            }
                boolean flag = true;
                if(Count1<2&&Count2<2&&Count3<2){
                    flag = false;
                }
                    return flag;
        }
	private double calculateDiscountPrice (){
		double discountedPrice = 0.0;
		
		for (Product product : products) {
			discountedPrice += product.getPrice() - (product.getPrice() * product.getDiscount() / 100.0);
		}
		
		double fullHouseDiscountedPrice = 0.0;
		
		if (isFullHouseDiscountAvailable()) {
			for (Product product : products) {
				fullHouseDiscountedPrice += product.getPrice() - (product.getPrice() / 2.0);		// 50%
			}
		}
		
		return discountedPrice < fullHouseDiscountedPrice ? discountedPrice : fullHouseDiscountedPrice;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public String getInvoice() {   
            String dateStr = String.format("Date - %s\r\n", date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		String productNames = "";
                for(Product product:products){
              String a= "\n Name: "+ product.getName()+"  Pice:"+product.getPrice() ;
              productNames=  productNames .concat(a) ;
              
                }
               
               String invoice =  dateStr + productNames 
                       + String.format( 
                    
                       "Total Price: %s\r\n" + 
		       "Price after discount: %s",
	                calculatePriceWithoutDiscount(),
			calculateDiscountPrice());
		
		return invoice;
	}
}
        

