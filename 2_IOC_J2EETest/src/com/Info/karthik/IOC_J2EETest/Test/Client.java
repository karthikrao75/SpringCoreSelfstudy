package com.Info.karthik.IOC_J2EETest.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext factory=new ClassPathXmlApplicationContext("resources/spring.xml");
System.out.println("document loaded sucessfully");
  factory.getBean("test");// since it is a J2EE IOC, bean is loaded on on startup.
  factory.getBean("test");
  factory.getBean("test");
  //output for scope singleton
  /*Test Constructor
	document loaded sucessfully

*/
  
  /*output for scope prototype behaves same as core IOC
   * document loaded sucessfully
	Test Constructor
	Test Constructor
	Test Constructor
   */
	}

}
