package SpringBoot.basics.containerandbean;
//Note: the files are names the same thing just in different packages. Look at the packages first!

public class Person { //looks like a one-to-one relationship or a has-one relationship?
    private String fullName;  //think address belongs to Person
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName(){ return fullName;}
    public Address getAddress(){ return address;}
}
