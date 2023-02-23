package org.example.lambdaexps;

import org.example.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {

        Customer cus1 = new Customer(1, "Nonso");
        Customer cus7 = new Customer(7, "Nonso");
        Customer cus2 = new Customer(2, "Jude");
        Customer cus3 = new Customer(3, "Mark");
        Customer cus4 = new Customer(4, "Matt");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(cus1);
        customerList.add(cus2);
        customerList.add(cus3);
        customerList.add(cus4);
        customerList.add(cus7);


        List<Customer> result = customerList.stream()
                .filter(cus -> cus.getName()
                        .equalsIgnoreCase("Nonso")).toList();

        System.out.printf("Result: %s\n", result);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List<String> numToString = numbers.stream()
                .filter(n -> n != 2).map(Object::toString).toList();
        System.out.println(numToString);
    }
}
