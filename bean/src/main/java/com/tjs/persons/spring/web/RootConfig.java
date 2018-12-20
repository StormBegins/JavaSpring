package com.tjs.persons.spring.web;

import com.tjs.persons.spring.SpringDAOConfig;
import com.tjs.persons.spring.SpringServiceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.tjs.persons.spring")
@PropertySource(value = "classpath:jdbc.properties")
@Import({SpringDAOConfig.class, SpringServiceConfig.class})
public class RootConfig {

}
