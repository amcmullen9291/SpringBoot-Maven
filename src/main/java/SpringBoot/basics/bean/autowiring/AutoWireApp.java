package SpringBoot.basics.bean.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWireApp {
    public static void main(String[] args) {
        ApplicationContext constructor = new AnnotationConfigApplicationContext(AutoWireConfig.class);
        Person person = constructor.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        System.out.println(person.getAge());
    }
}
