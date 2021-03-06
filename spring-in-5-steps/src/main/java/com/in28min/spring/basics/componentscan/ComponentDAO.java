package com.in28min.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Repository
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection componentJdbcConnection;
}
