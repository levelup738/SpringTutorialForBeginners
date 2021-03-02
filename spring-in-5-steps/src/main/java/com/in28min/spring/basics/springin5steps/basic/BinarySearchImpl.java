package com.in28min.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private static final Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

	@Autowired
	@Qualifier("quick")
	private SortAlgorithm bubbleSortAlgorithm;

	public int binarySearch(int[] numbers, int num) {
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
}
