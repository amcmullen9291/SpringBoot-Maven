package SpringBoot.basics.containerandbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {
    public static void main(String[] args) {
        ApplicationContext contextWithXMLConfig = new ClassPathXmlApplicationContext("basic-config.xml");
        Person John = (Person) contextWithXMLConfig.getBean("person");
        System.out.println(John.getFullName()); //the values from the basic-config metadata
        System.out.println(John.getAddress());

        ApplicationContext contextWithJavaConfig = new AnnotationConfigApplicationContext(BeanConfig.class);
        Address address = (Address) contextWithJavaConfig.getBean("address"); //demo using both identifiers
        Address address2 = (Address) contextWithJavaConfig.getBean("park place");
        Address address3 = contextWithJavaConfig.getBean("park place", Address.class); //same thing without casting
        System.out.println(address);
        System.out.println(address2 == address3);

        System.out.println("#################");
        Person person = contextWithJavaConfig.getBean(Person.class);
        //this one only works because there is only one Person constructor. no identifier needed
        System.out.println(person.getFullName());
        System.out.println(person.getAddress());
    }
}
