package edu.wccnet.aurewhite;

public class Order {
    // basically, the class to wrap all the other classes
    // into one thing it takes the customer and pizzas
    // vars
    // customer
    Customer customer;
    // Number of pizzas
    int number_of_pizzas;
    // array of pizzas
    Pizza[] pizzas;

    // constructor

    public Order(Customer customer, int number_of_pizzas, Pizza[] pizzas) {
        this.customer = customer;
        this.number_of_pizzas = number_of_pizzas;
        this.pizzas = pizzas;
    }

    // getters and setters

}
