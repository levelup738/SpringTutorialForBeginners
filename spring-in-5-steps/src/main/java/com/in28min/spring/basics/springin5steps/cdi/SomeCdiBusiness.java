package com.in28min.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Named
public class SomeCdiBusiness {
	@Inject
	SomeCdiDao someCdiDao;
	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = someCdiDao.getData();
		for(int value:data) {
			if(value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}
