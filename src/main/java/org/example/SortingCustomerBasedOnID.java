package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingCustomerBasedOnID {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        Customer c80 = new Customer(2, "Snoop Dogg");
        Customer c1 = new Customer(10, "Kanye West");
        Customer c4 = new Customer(6, "Nicki Minaj");
        Customer c8 = new Customer(1, "Drake");
        Customer c2 = new Customer(3, "Burna Boy");

        customers.add(c80);
        customers.add(c1);
        customers.add(c4);
        customers.add(c8);
        customers.add(c2);

        System.out.println("Before sorting: " + customers);

        Collections.sort(customers, new SortComparator());

        System.out.println("After sorting: ");
//        for (Iterator<Customer> it = customers.iterator(); it.hasNext();) {
//            Customer c = it.next();
//            System.out.printf("Customer name: %s, Customer ID: %d\n", c.getName(), c.getId());
//        }
    }
}
