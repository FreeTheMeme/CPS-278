package edu.wccnet.aurewhite;

public class Customer {
    // vars
    private String name;
    private Address address;

    // constructor
    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    //to string

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                "}";
    }

    // getters and setters
}
