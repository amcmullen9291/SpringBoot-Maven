package SpringBoot.basics.bean.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class Person {
    private Name name;
    private Address address;
    private int age;

    public  Person (Name name){
        this.name = name;
    }

    public Name getName(){ return name;}

    @Autowired
    public void setAddress( Address address){
        this.address = address;
    }

    public Address getAddress(){ return address; }

    @Autowired
    public void setAge(Environment environment){
        this.age = environment.getProperty("age", Integer.class,35);
    }
    // use Environment class for autowired with primitive variable types

    public int getAge() { return age; }
}
