package edu.wccnet.aurewhite;

public class Pizza {
    //vars
    // size (s,m,l)
    String size;

    // Number of toppings
    private String[] toppings;
    // and finally toppings I'm not sure how we're gonna store all the toppings,
    // one long string, maybe an array of string strings

    // constructor


    public Pizza(String size, String[] toppings) {
        this.size = size;
        this.toppings = toppings;
    }
}
