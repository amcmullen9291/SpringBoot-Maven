package SpringBoot.basics.container;

import org.springframework.context.annotation.Bean;

public class BeanLightModeConfig { //the beans are independent of each other
    @Bean({"name", "John"})
    public Name getName(){
        return new Name("John", "Douglas");
    }
    @Bean
    public Person getPerson(){
        return new Person(getName());
    }
}
