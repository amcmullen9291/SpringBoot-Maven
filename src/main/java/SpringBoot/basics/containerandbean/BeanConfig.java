package SpringBoot.basics.containerandbean;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
@Bean({"address", "park place"})  //two identifiers
    Address getAddress(){ return new Address(200, " Park Place");}

    @Bean
    Person getPerson(){ //no identifier supplied so, the method name is the "name" of the bean
        Person person = new Person();
        person.setFullName("John Doe");
        person.setAddress(getAddress());
        return person;
    }
}
