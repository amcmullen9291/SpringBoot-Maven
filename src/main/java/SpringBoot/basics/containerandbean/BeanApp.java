package SpringBoot.basics.containerandbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {
    public static void main(String[] args) {
        ApplicationContext contextWithXMLConfig = new ClassPathXmlApplicationContext("basic-config.xml");
        Person John = (Person) contextWithXMLConfig.getBean("person");
        System.out.println(John.getFullName()); //the values from the basic-config metadata
        System.out.println(John.getAddress());
    }
}
