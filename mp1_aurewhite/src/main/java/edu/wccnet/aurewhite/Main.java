package edu.wccnet.aurewhite;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; // 1. Import the Scanner class

public class Main {
    public static void main(String[] args) {
        // vars
        // Customer info
        String name;
        String street;
        String city;
        String state;
        String zip_code;
        // pizza info
        int number_of_pizzas;
        Scanner scanner = new Scanner(System.in);
            // enter name
        System.out.print("please enter your information\n");
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
            // enter address
        System.out.print("Enter your street: ");
        street = scanner.nextLine();
        System.out.print("Enter your address: ");
        System.out.print("Enter your city: ");
        city = scanner.nextLine();
        System.out.print("Enter your state: ");
        state = scanner.nextLine();
        System.out.print("Enter your zip code: ");
        zip_code = scanner.nextLine();
        // take user input and puts it in an Address object
        Address address = new Address(street,city,state,zip_code);
        Customer customer = new Customer(name,address);
        System.out.print(customer);
            // enter number of pizzas
        System.out.print("how many pizzas do you want to order?");
        number_of_pizzas = scanner.nextInt();
        scanner.nextLine(); // Consume left over newline
        // var to store pizzas
        Pizza[] pizzas = new Pizza[number_of_pizzas];
        // add some sort of for loop to enter pizza specs
        for (int i = 0; i < number_of_pizzas; i++) {
            // Size
            System.out.print("please enter the size for pizza-"+(i+1)+"\n");
            String size = scanner.nextLine();
            // Number of toppings
            System.out.println("please enter number of toppings:");
            int number_of_toppings = scanner.nextInt();
            scanner.nextLine(); // Consume left over newline
            // A place to store toppings
            String[] toppings = new String[number_of_toppings];
            // Each topping
            System.out.print("choices are:\n");
            // topping loop
            for (int topping_slot = 0; topping_slot < number_of_toppings; topping_slot++) {
                System.out.println("choose topping-"+ (topping_slot+1));
                toppings[topping_slot] = scanner.nextLine();
            }
            // Create Pizza Object
            Pizza pizza = new Pizza(size,number_of_toppings,toppings);
            pizzas[i] =pizza;
        }
        //and to top it off (pun intended)
        //create a new Order object and print it
        Order order = new Order(customer,number_of_pizzas,pizzas);
        System.out.print(order);



        scanner.close();
    }
}