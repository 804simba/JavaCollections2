package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        queue();
//        priorityQueue();
        int[] array = {1, 4, 2, 2, 7, 10, 10, 5, 12, 10, 10};
        String word = "sTress";
//        String res =
        firstSingleChar(word);
//        System.out.println(res);


    }

    public static void firstSingleChar(String word) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] charactersArray = word.toCharArray();

        for (char c : charactersArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                String res = Character.toString(entry.getKey());
                System.out.println(res);
                break;
            }
        }
        System.out.println("none");
    }

    public static void linkedHashMap(int[] array) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int a : array) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a)+1);
            } else {
                map.put(a, map.getOrDefault(a, 0));
            }
        }
        System.out.println(map);
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(0)) {
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
    }

    public static void queue() {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(12);
        numbers.offer(10);
        numbers.offer(8);
        numbers.offer(14);
        System.out.println("Everything on the queue: " + numbers);
        Integer n = numbers.peek(); // returns the first item in the queue, it only returns true if the queue is not null else false;
        System.out.println("First item that is returned: " + n);
        System.out.println(numbers);
        Integer removedNumber = numbers.poll(); // removes the first item in the queue
        System.out.println("removed number: " + removedNumber);
        System.out.println("Updated Queue: " + numbers);
    }

    public static void priorityQueue() {
        Queue<String> pq = new PriorityQueue<>();
        pq.offer("Hannah");
        pq.offer("Jay");
        pq.offer("Kanye West");

        System.out.println("Original Priority Queue: " + pq);
        String firstItem = pq.peek();
        System.out.println("returned First item: " + firstItem);
        System.out.println("Original Priority Queue: " + pq);
        String removedName = pq.poll();
        System.out.println("Removed name: " + removedName);
        System.out.println("updated queue." + pq);
    }
}