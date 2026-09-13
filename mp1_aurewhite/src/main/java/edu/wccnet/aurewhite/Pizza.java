package edu.wccnet.aurewhite;

public class Pizza {
    //vars
    // size (s,m,l)
    char size;

    // Number of toppings
    private String[] toppings;
    // and finally toppings I'm not sure how we're gonna store all the toppings,
    // one long string, maybe an array of string strings

    // constructor

    public Pizza(char size, String[] toppings) {
        this.size = size;
        this.toppings = toppings;
    }

    // getters and setters

    // size
    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    // toppings
    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }
}
