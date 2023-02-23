package org.example;

import java.util.*;

public class QueueExamples {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 50, 7, 400, 4};

        Queue<Integer> queue = new LinkedList<>();
        Collections.addAll(queue, array);
        System.out.println(queue);

        String[] strArray = {"Daniel", "Harry", "James"};

        Queue<String> namesQueue = new LinkedList<>();
        Collections.addAll(namesQueue, strArray);
        System.out.println(namesQueue);

        String[] newNamesArray = namesQueue.toArray(new String[queue.size()]);
        System.out.println(Arrays.toString(newNamesArray));

        AbstractQueue<String> abstractQueue = new PriorityQueue<>();
        abstractQueue.offer("a");
        abstractQueue.offer("z");
        abstractQueue.offer("b");
        abstractQueue.offer("j");
        abstractQueue.offer("y");

        System.out.println(abstractQueue);

        List<String> list = new LinkedList<>();

        list.add("fat");
        list.add("cat");
        list.add("rat");
        list.add("hat");

        // ListIterator helps us to transverse lists and also remove or get values from them.
        for (String curr : list) {
            System.out.println(curr);
        }
    }

    private static void linkedListQueueExample() {
        Queue<Client> clientQueue = new LinkedList<>();

        boolean added1 = clientQueue.offer(new Client("Yu Hang"));
        boolean added2 = clientQueue.offer(new Client("Yo Papa"));
        boolean added3 = clientQueue.offer(new Client("YO Mama"));

        System.out.printf("First customer: %s\n", clientQueue.poll());
        System.out.printf("Second customer: %s\n", clientQueue.poll());
        System.out.println(clientQueue);
        System.out.printf("Head of queue: %s\n", clientQueue.peek());

        clientQueue.offer(new Client("Eat YoWok"));
        clientQueue.offer(new Client("Yu DEKraze"));
        clientQueue.offer(new Client("Yu DEKraze"));

        while(!clientQueue.isEmpty()) {
            System.out.println(clientQueue.poll());
        }
    }
}
