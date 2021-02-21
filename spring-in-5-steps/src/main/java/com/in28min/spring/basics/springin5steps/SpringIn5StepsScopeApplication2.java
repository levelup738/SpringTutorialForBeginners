package com.in28min.spring.basics.springin5steps;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28min.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsScopeApplication2 {

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsScopeApplication2.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsScopeApplication2.class, args);
		
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		logger.info("{}", personDAO);
		logger.info("{}", personDAO.getJdbcConnection());
		
		logger.info("{}", personDAO2);
		logger.info("{}", personDAO2.getJdbcConnection());
		
	}

}
