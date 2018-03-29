package com.bangbon.home.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.bangbon.home.firstProject.util.RequestReader;

@Configuration
public class AppConfig implements WebMvcConfigurer {

	@Autowired
	RequestReader requestReader;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestReader);
	}
}
