package org.example;

import java.util.Comparator;

public class ClientComparator implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        return Double.compare(o2.getCreditCardBalance(), o1.getCreditCardBalance());
    }
}
