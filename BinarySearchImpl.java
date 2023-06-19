package com.example.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//Implementing Sorting Logic
		//Bubble Sort Algorithm
		//Search the array
		
		
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);		
		return 3;
	}
	

}
