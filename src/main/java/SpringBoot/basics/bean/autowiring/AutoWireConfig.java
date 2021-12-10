package SpringBoot.basics.bean.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("person.properties")
public class AutoWireConfig {
    @Bean
    public Name getName(){ return new Name("Tom", "Jones");}

    @Bean
    public Address getAddress(){ return  new Address(100, "Main Street");}

    @Bean
    public Person getPerson(){ return new Person(getName());}

}
