package SpringBoot.basics.scanning;

import SpringBoot.basics.scanning.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanningApp {
    public static void main(String[] args) {
        ApplicationContext constructor = new AnnotationConfigApplicationContext(ScanningConfig.class);
        ApplicationContext constructor2 = new AnnotationConfigApplicationContext(ScanningConfig.class);
        Person person1 = (Person) constructor.getBean("person");
        person1.setFullName("John Paul");
        Person person2 = constructor2.getBean(Person.class);
        Person person3 = constructor.getBean(Person.class); //test

        System.out.println(person1.getFullName());
        System.out.println(person1==person2); //false
        System.out.println(person1==person3); //true
        // the instances are the same because they point to the same instance of the constructor class?
    }
}
