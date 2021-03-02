package com.in28min.spring.basics.springin5steps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.in28min.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import com.in28min.spring.basics.springin5steps.basic.BinarySearchImpl;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
class BinarySearchTest {
	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	void testBasicScenario() {
		int result = binarySearch.binarySearch(new int[] {}, 5);
		assertEquals(3, result);
	}
}
