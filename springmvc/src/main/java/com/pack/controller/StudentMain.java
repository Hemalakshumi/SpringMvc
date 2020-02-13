package com.pack.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentMain {

	public static void main(String[] args) {
		Resource resource= new ClassPathResource("stud.xml");​
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(resource);​​
		Student student=(Student) factory.getBean("studentname");​
		student.display();​
	}

}
