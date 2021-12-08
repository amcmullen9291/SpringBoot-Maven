package SpringBoot.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Introduction {
    public static void main(String[] args) {
        Person John = new Person("John Henry");
        System.out.println(John.getFullName());

        ApplicationContext context = new AnnotationConfigApplicationContext(IntroductionConfig.class);
        Person Andrew = context.getBean(Person.class);
        System.out.println(Andrew.getFullName());
    }
}
