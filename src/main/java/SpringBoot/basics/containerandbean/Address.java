package SpringBoot.basics.containerandbean;

public class Address {
    private int houseNumber;
    private String streetName;

    public Address(int houseNumber, String streetName){
        this.houseNumber = houseNumber;
        this.streetName = streetName;
    }

    @Override
    public String toString(){ return houseNumber + streetName;}
}
