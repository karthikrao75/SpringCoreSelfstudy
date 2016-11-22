package com.Info.karthik.IOC_CoreTest.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory factory=new XmlBeanFactory(new ClassPathResource("resources/spring.xml"));
System.out.println("document loaded sucessfully");
  factory.getBean("test");// since it is a core IOC bean is loaded on request.
  factory.getBean("test");
  factory.getBean("test");
  //output for scope singleton
  /*document loaded sucessfully
	Test Constructor
*/
  
  /*output for scope prototype
   * document loaded sucessfully
	Test Constructor
	Test Constructor
	Test Constructor
   */
	}

}
