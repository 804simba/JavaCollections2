package org.example;

import java.util.Comparator;

public class SortComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c2.getId() - c1.getId();
    }
}
