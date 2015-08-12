package org.sowmya.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main (String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restuarant restuarantObj = (Restuarant) context.getBean("restuarantBean");
		restuarantObj.prepareHotDrink();
	}

}
