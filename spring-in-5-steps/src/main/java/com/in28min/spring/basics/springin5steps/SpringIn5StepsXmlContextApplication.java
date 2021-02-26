package com.in28min.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28min.spring.basics.springin5steps.xml.XmlPersonDAO;

public class SpringIn5StepsXmlContextApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationcontext.xml")) {

			logger.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());

			XmlPersonDAO dao = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(dao);
			System.out.println(dao.getXmlJdbcConnection());
		}
	}

}
