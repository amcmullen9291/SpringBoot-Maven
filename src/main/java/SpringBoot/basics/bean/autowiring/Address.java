package SpringBoot.basics.bean.autowiring;

public class Address {
    private int number;
    private String streetName;

    public Address(int number, String streetName){
        this.number = number;
        this.streetName = streetName;
    }

    @Override
    public String toString(){
        return number + " " + streetName;
    }
}
