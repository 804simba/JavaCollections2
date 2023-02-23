package org.example;

public class Client {
    private String name;
    private Double creditCardBalance;

    public Client(String name, Double creditCardBalance) {
        this.name = name;
        this.creditCardBalance = creditCardBalance;
    }

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getCreditCardBalance() {
        return creditCardBalance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
