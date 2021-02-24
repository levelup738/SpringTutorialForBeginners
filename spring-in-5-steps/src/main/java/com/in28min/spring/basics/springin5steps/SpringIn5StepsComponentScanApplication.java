package com.in28min.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28min.spring.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan
@ComponentScan("com.in28min.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
				//SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		logger.info("{}", componentDAO);
		logger.info("{}", componentDAO.getComponentJdbcConnection());
		
	}

}
