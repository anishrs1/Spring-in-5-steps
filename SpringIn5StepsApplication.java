package com.example.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		//com.example.spring.basics.springin5steps.BubbleSortAlgorithm@1eb44e46
		//com.example.spring.basics.springin5steps.QuickSortAlgorithm@6504e3b2
		System.out.println(result);
		
		
	}

}
