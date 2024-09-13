package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductTest {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000));
		productsList.add(new Product(2, "Dell Laptop", 30000));
		productsList.add(new Product(3, "Lenevo Laptop", 28000));
		productsList.add(new Product(4, "Sony Laptop", 28000));
		productsList.add(new Product(5, "Apple Laptop", 90000));
		productsList.add(new Product(6, "Apple IPAD", 45000));
		
		long count = productsList.stream().filter(prod->prod.price<30000)
				.map(p->p.price).count();
		
		List<Long> collect = productsList.stream().filter(prod->prod.price<30000)
				.map(p->p.price).collect(Collectors.toList());
		
		List<Product> collect2 = productsList.stream().filter(prod->prod.price<30000)
				.collect(Collectors.toList());
		
		System.out.println(count); // to displaying count
		System.out.println(collect); // to displaying only price
		System.out.println(collect2); // to displaying object data
	}
}
