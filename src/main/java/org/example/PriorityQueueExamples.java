package org.example;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExamples {
    public static void main(String[] args) {
        Queue<Client> clients;
        clients = new PriorityQueue<>(4, new ClientComparator());

        clients.offer(new Client("Elon Musk", 3000.0));
        clients.offer(new Client("Kanye West", 600000.0));
        clients.offer(new Client("Bill Gates", 75000.0));
        clients.offer(new Client("Beyonce", 450000.0));
        Client c = clients.poll();
        System.out.println(c);
        clients.offer(new Client("Simba Timtez", 850000.0));

        for (Client client : clients) {
            System.out.println("Name: " + client.getName() + ", NetWorth: " + client.getCreditCardBalance());
        }
    }
}
