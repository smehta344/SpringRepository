package com.aw.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.aw.beans.Robot;

public class AutowiringTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/aw/common/application-context.xml"));
		Robot robot = factory.getBean("robot", Robot.class);
		System.out.println(robot);
	}
}
