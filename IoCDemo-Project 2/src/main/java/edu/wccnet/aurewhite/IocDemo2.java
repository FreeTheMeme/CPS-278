package edu.wccnet.aurewhite;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IocDemo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("beanConfig.xml");
        IBird bird = (IBird)context.getBean("bird");
        System.out.println(bird.getEatingHabit());
        
        ((ClassPathXmlApplicationContext)context).close();
    }

}
