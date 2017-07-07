import java.util.ArrayList;
import java.util.List;

public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Product> productList = new ArrayList<Product>();

		// Adding Products
		productList.add(new Product(1, "Sony mobile", 25000));
		productList.add(new Product(2, "Lenovo mobile", 15000));
		productList.add(new Product(3, "Nokia mobile", 10000));
		productList.add(new Product(4, "Samsung mobile", 40000));

		
		/*
		 * reduce method takes a sequence of input elements 
		 * and combines them into a single summary result 
		 * by repeated operation.
		 * 
		 * Using reduce method we can perform Sum, min, max, average, 
		 * and string concatenation.
		 * 
		 * Here we are using reduce() method, which is used to sum of 
		 * all the product prices.
		 */		
		Integer totalPrice1 = productList.stream() 
                .map(product->product.getPrice())  
                .reduce(0,(sum, price)->sum+price);  // accumulating price  
	
		System.out.println(totalPrice1);  
				
		Integer totalPrice2 = productList.stream()  
        		.map(product->product.getPrice())  
                .reduce(0,Integer::sum);   // accumulating price, by referring method of Integer class
        
        System.out.println(totalPrice2);  		
	}

}