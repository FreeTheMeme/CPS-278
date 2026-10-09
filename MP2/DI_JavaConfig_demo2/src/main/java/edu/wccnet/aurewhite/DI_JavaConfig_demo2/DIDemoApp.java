package edu.wccnet.aurewhite.DI_JavaConfig_demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIDemoApp {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIDemoJavaConfig.class);
    College college = (College)context.getBean("college");

    System.out.println(college);
    college.printCollegeService();

    Finaid finaid = (Finaid)context.getBean("finaid");
    finaid.displayFinaid();
    context.close();
  }
}
