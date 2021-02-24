package com.in28min.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection componentJdbcConnection;
}
