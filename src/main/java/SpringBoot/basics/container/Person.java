package SpringBoot.basics.container;

public class Person {
    private Name name;

    public Person(Name name){
        this.name = name;
    }

    public Name getName() { return name; }

    public Name getPerson() { return name; } //testing
}
