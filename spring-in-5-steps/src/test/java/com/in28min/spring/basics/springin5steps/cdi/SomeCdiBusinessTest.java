package com.in28min.spring.basics.springin5steps.cdi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.in28min.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import com.in28min.spring.basics.springin5steps.basic.BinarySearchImpl;

@ExtendWith(SpringExtension.class)
class SomeCdiBusinessTest {
	
	@InjectMocks
	SomeCdiBusiness someCdiBusiness;
	@Mock
	SomeCdiDao daoMock;
	
	@Test
	void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2, 4});
		assertEquals(4, someCdiBusiness.findGreatest());
	}
	@Test
	void testBasicScenario_NoElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { });
		assertEquals(Integer.MIN_VALUE, someCdiBusiness.findGreatest());
	}
	@Test
	void testBasicScenario_EqualElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,2});
		assertEquals(2, someCdiBusiness.findGreatest());
	}
}
