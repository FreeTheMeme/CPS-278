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
        new Customer(name,address);

            // enter number of pizzas
        System.out.print("how many pizzas do you want to order?");
        number_of_pizzas = scanner.nextInt();

        // add some sort of for loop to enter pizza specs
        for (int i = 0; i < number_of_pizzas; i++) {
            // Size
            System.out.print("please enter the size:");
            String size = scanner.nextLine();
            // Number of toppings
            // Each topping
        }


//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();



        scanner.close();
    }
}