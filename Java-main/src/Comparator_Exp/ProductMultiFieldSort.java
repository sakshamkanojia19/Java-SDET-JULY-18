package Comparator_Exp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{
	int id;
	String name;
	double price;
	
	
	public Product(int id,String name, double price) {
		  this.id = id;
	        this.name = name;
	        this.price = price;
	}
	
	public String toString() {
		return id+" "+name+" $"+price;
	}
	
}

// Comparator to sort by price, then by name
class ProductComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        // First, compare by price
        if (p1.price < p2.price) return -1;
        else if (p1.price > p2.price) return 1;
        else {
            // If price is same, compare by name (alphabetically)
            return p1.name.compareTo(p2.name);
        }
    }
}





public class ProductMultiFieldSort {


	public static void main(String[] args) {
		
		
		List<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", 55000));
        products.add(new Product(102, "Tablet", 25000));
        products.add(new Product(103, "Smartphone", 25000));
        products.add(new Product(104, "Monitor", 18000));
        products.add(new Product(105, "Keyboard", 1500));
        products.add(new Product(106, "Mouse", 1500));
        products.add(new Product(107, "Charger", 1500));
        products.add(new Product(108, "Headphones", 18000));
        
        
        //Sort using custome comparator
        
        Collections.sort(products, new ProductComparator());

        System.out.println("Products sorted by price, then name:");
        for (Product p : products) {
            System.out.println(p);
        }
        
        
		
	}

}
