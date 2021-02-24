package com.in28min.spring.basics.springin5steps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28min.spring.basics.springin5steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan("com.in28min.spring.basics.springin5steps")
public class SpringIn5StepsXmlContextApplication {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext =
				 new ClassPathXmlApplicationContext("applicationContext.xml")) {

			XmlPersonDAO dao = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(dao);
			System.out.println(dao.getXmlJdbcConnection());
		}
	}

}
