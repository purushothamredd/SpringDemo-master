package com.deeptech.spring1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringTest 
{

	public static void main(String[] args)
	{
		Resource res= new ClassPathResource("ApplicationContext.xml");
		BeanFactory ft = new XmlBeanFactory(res);
		Student s = (Student) ft.getBean("stu");
		s.display();

	}

}
