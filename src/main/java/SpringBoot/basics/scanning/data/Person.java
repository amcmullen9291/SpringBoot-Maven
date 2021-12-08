package SpringBoot.basics.scanning.data;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String fullName;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName(){ return fullName;}
}
