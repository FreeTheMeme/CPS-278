package edu.wccnet.aurewhite;

public class Address {
    // vars
    private String street;
    private String city;
    private String state;
    private String zip_code;
// I'm not exactly sure what needs to go in this class but I think we'll do like
// separate variables for city state Road etc.
    // constructor

    public Address(String street, String city, String state, String zip_code) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
    }
    //to string

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip_code='" + zip_code + '\'' +
                "}\n";
    }

    // getters and setters

}
