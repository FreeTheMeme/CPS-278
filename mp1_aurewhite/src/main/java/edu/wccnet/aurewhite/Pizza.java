package edu.wccnet.aurewhite;

import java.util.Arrays;

public class Pizza {
    //vars
    // size (s,m,l)
    String size;
    // Number of toppings
    int number_of_toppings;
    //toppings array
    String[] toppings;


    // constructor

    public Pizza(String size, int number_of_toppings, String[] toppings) {
        this.size = size;
        this.number_of_toppings = number_of_toppings;
        this.toppings = toppings;
    }
    public void add_topping_info(int topping_slot, String topping_name){
        toppings[topping_slot] = topping_name;
    }
    //to string

    @Override
    public String toString() {
        return "\nPizza{" +
                "size='" + size + '\'' +
                ", number of toppings=" + number_of_toppings +
                ", toppings=" + Arrays.toString(toppings) +
                "}\n";
    }
}
