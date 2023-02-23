package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExamples {
    public static void main(String[] args) {
        Customer cus1 = new Customer(1, "Jay Z");
        Customer cus2 = new Customer(2, "Rihanna");
        Customer cus3 = new Customer(3, "Ye");
        var customers = List.of(cus1, cus2, cus3);
//        customers.forEach(System.out::println);
        customers.stream().map(Customer::getName)
                .forEach(System.out::println);

        List<Integer> num1 = new ArrayList<>();

        num1.add(4);
        num1.add(1);
        num1.add(2);
        num1.add(8);
        num1.add(3);
        System.out.println("Before sort: " + num1);
        Collections.sort(num1);
        System.out.println("After sort: " + num1);

    }
}
