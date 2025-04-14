package com.codeWithSan.San;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codeWithSan.San.Models.Product;
import com.codeWithSan.San.repositories.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String ...args) throws Exception{
		// Check the DataTable is empty or not
		if(productRepository.count()==0) {
			// Seeding data If the Table is empty
			List<Product> products = Arrays.asList(
					new Product("Wireless Mouse", 25.99, "Ergonomic wireless mouse", 4.5, "Electronics", "TechStore", 150, 1200,Arrays.asList("https://example.com/images/mouse1.jpg", "https://example.com/images/mouse2.jpg")),
					new Product("Basic Pen", 1.00, "Simple ballpoint pen", 0.0, "Stationery", "OfficeMart", 500, 50,Arrays.asList("https://example.com/images/pen.jpg")),
					new Product("Premium Headphones", 299.99, "Noise-cancelling over-ear headphones", 5.0, "Audio", "SoundKing", 30, 950,Arrays.asList("https://example.com/images/headphones1.jpg", "https://example.com/images/headphones2.jpg")),
					new Product("Smart Watch", 199.99, "Fitness tracking smart watch", 4.2, "Wearables", "FitGear", 0, 300, Arrays.asList("https://example.com/images/watch.jpg")),
					new Product("Bulk USB Drives", 4999.99, "1000-pack USB drives", 4.8, "Storage", "BulkDepot", 1000000, 9999999, Arrays.asList(
					        "https://example.com/images/usb1.jpg",
					        "https://example.com/images/usb2.jpg",
					        "https://example.com/images/usb3.jpg",
					        "https://example.com/images/usb4.jpg"
					    )),
					new Product("Laptop Stand", 39.99, "Adjustable metal laptop stand", 4.0, "Office Supplies", "DeskPro", 100, 0,Arrays.asList("https://example.com/images/stand.jpg"))
					);
			productRepository.saveAll(products);
			System.out.println("Data is Feed While the table is empty");
		}
	}
}
