package product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory implements Iterable<StockableProduct> {
	
	private List<StockableProduct> products =  new ArrayList<StockableProduct>();
	
	public Inventory() {
		products = new ArrayList<StockableProduct>();
	}
	
	public void addItem(StockableProduct product) {
		products.add(product);
	}
	
	public void removeItem(int productId) {
		products.remove(productId);
	}
	
	public Product getItem(int productId) {
		return products.get(productId);
	}
	
	public void addProductStock(int productId, int numberOfNewStock) {
		Product product = getItem(productId);
		StockableProduct stockableProduct = (StockableProduct)product;
		
	}
	
	public void sortByPrice() {
		products.sort(new PriceComparator());
	}
	
	public void sortByAvailableStock() {
		products.sort(new StockComparator());
	}
	
	@Override
	public Iterator<StockableProduct> iterator() {
		return products.iterator();
	}
	
}
