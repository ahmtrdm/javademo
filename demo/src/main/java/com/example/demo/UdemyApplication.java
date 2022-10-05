package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UdemyApplication {

	public static void main(String[] args) {

		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());



		ConfigurableApplicationContext applicationContext
				= SpringApplication.run(UdemyApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {1,2,4,6,9}, 3);
		System.out.println(result);

	}

}
