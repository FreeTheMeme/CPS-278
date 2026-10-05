package edu.wccnet.aurewhite.DI_XML_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIDemoApp {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    College college = (College)context.getBean("college");

    System.out.println(college);
    college.printCollegeService();

    Finaid finaid = (Finaid)context.getBean("Finaid");
    finaid.displayFinaid();
    ((ClassPathXmlApplicationContext)context).close();
  }
}
