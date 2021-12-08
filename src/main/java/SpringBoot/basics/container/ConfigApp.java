package SpringBoot.basics.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigApp {
    public static void main(String[] args) {
        ApplicationContext constructor = new AnnotationConfigApplicationContext(BeanLightModeConfig.class);
        Name nameBean = constructor.getBean(Name.class); // "get bean for name class"
        Person personBean = constructor.getBean(Person.class); //"constructor get bean for the person class"
        System.out.println(personBean.getPerson().getFirstName()); //Person>Name>parameter

//        The name class has a firstName attribute, not the Person, the Name belongs to the person,
//        the firstname belongs to the name. OOP

        System.out.println(nameBean.getFirstName() + " " + nameBean.getLastName()); //test

        //with config annotation below:
        ApplicationContext constructor2 = new AnnotationConfigApplicationContext(BeanFullModeConfig.class);
        Name nameBean2 = constructor2.getBean(Name.class);
        Person personBean2 = constructor2.getBean(Person.class);
        System.out.println(nameBean2 == personBean2.getName());
    }
    // the application context always references the entire class.
    // THEN, you can cast type or not to the individual constructors
    //3 steps: Class >> bean >> identifier
}
