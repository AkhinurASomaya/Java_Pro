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
public class StockComparator implements Comparator<StockableProduct> {

    @Override
    public int compare(StockableProduct a, StockableProduct b) {
        return Integer.compare(a.getNumberofitemsstocked(), b.getNumberofitemsstocked());
    }
    
}
