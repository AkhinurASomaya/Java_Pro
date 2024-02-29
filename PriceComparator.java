/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.util.Comparator;

/**
 *
 * @author Computer Solution
 */
public class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product a, Product b) {
        return Double.compare(a.getPrice(), b.getPrice());
    }
    
}
