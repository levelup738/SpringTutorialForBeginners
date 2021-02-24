package com.in28min.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28min.spring.basics.springin5steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication2 {

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsScopeApplication2.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication2.class);
				//SpringApplication.run(SpringIn5StepsScopeApplication2.class, args);
		
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		logger.info("{}", personDAO);
		logger.info("{}", personDAO.getJdbcConnection());
		
		logger.info("{}", personDAO2);
		logger.info("{}", personDAO2.getJdbcConnection());
		
	}

}
