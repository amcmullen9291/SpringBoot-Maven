package SpringBoot.basics;

import org.springframework.context.annotation.Bean;

//the Spring way...
public class IntroductionConfig {
    @Bean  //configuration annotation. allows Spring to automatically detect your custom beans
    public Person getPerson(){ return new Person("Andrew Jacobs");}
            // the metadata or instructions to instantiate and instance
}
