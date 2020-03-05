package com.Sapo.ex05;

import com.Sapo.ex05.Entity.ProductEntity;
import com.Sapo.ex05.Repository.CategoryRepository;
import com.Sapo.ex05.Repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Ex05Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ex05Application.class, args);
	/*	CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		List<ProductEntity> entitiesPro = productRepository.findAll();

		System.out.println("Product ID and number of product: ");
		for (ProductEntity item:entitiesPro) {
			System.out.println(item.getCategory().getCategoryId() +" " + item.getProductName() );
		}*/
	}

}
