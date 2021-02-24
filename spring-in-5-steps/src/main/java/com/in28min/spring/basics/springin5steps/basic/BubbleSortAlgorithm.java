package com.in28min.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	@Override 
	public int[] sort(int[] numbers) {
		// TODO Auto-generated method stub
		return numbers;
	}
}
