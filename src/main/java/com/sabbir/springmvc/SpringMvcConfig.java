package com.sabbir.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
 * @Configuration
 * 
 * @ComponentScan({"com.sabbir.springmvc"}) public class SpringMvcConfig {
 * 
 * @Bean public InternalResourceViewResolver viewResolver() {
 * 
 * InternalResourceViewResolver vw = new InternalResourceViewResolver();
 * vw.setPrefix("/WEB-INF/view/"); vw.setSuffix(".jsp"); return vw; }
 * 
 * 
 * }
 */
@Configuration
@EnableWebMvc
@ComponentScan({ "com.sabbir.springmvc" })
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vw = new InternalResourceViewResolver();
		vw.setPrefix("/WEB-INF/view/");
		vw.setSuffix(".jsp");
		return vw;
	}

}