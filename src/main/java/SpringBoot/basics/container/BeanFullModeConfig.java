package SpringBoot.basics.container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFullModeConfig {
    @Bean({"name", "John"})
    public Name getName(){
        return new Name("John", "Doe");
    }
    @Bean
    public Person getPerson(){
        return new Person(getName());// dependency injection.
        // now when referenced, they point to the same piece of memory.
        //now, the Person Bean 'needs' the Name bean
    }
}
//    A @Configuration is also a @Component, but a @Component cannot act like a @Configuration.