package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExamples {
    // https://stackoverflow.com/questions/46579074/what-is-the-difference-between-list-of-and-arrays-aslist
    // https://www.softwaretestinghelp.com/java-list-how-to-create-initialize-use-list-in-java/#:~:text=The%20classes%20LinkedList%2C%20Stack%2C%20Vector,LinkedList%2C%20ArrayList%2C%20and%20Vector.
    public static void main(String[] args) {
//        mutableAndImmutableLists();
//        typeInference();
//        initializingListsUsingCollections();
//        addingTwoLists();
        listOfLists();
    }

    public static void mutableAndImmutableLists() {
        String[] animalsArray = {"Dog", "Cat", "Goat", "Cow"};
        // converting an array to a mutable arrayList.
        List<String> animals = new ArrayList<>(Arrays.asList(animalsArray));
        System.out.println("New mutable arrayList: " + animals);
        animals.add("Sheep");
        System.out.println(animals);

        // differences
        List<Integer> list = Arrays.asList(2, 1, 9, null);
        // Arrays.asList() return an immutable list.
        list.set(1, 100);
        list.set(3, 100);
        System.out.println("Immutable list: " + list);

        List<Integer> iList = new ArrayList<>(List.of(20, 90, 12));
        iList.add(100);
        System.out.println("Mutable list: " + iList);
    }

    public static void typeInference() {
        Customer cus1 = new Customer(1, "Jay Z");
        Customer cus2 = new Customer(2, "Rihanna");
        Customer cus3 = new Customer(3, "Ye");
        var customers = List.of(cus1, cus2, cus3); // this is an immutable list.
        customers.forEach(System.out::println);
        customers.stream()
                .map(Customer::getName)
                .forEach(System.out::println);

        List<Integer> num1 = new ArrayList<>(List.of(4, 1, 3, 10, 2, 30, 7)); // this is a mutable arrayList;
        System.out.println("Before sort: " + num1);
        num1.sort(Collections.reverseOrder());
        System.out.println("After sort: " + num1);
    }

    public static void initializingListsUsingCollections() {
        // empty list
        List<Integer> list = new ArrayList<>();

        // Instantiating list using Collections.addAll()
        Collections.addAll(list, 20, 70, 5, 10, 5);
        System.out.println("populated list: " + list);

        // Unmodifiable list
        List<Integer> nList = List.of(2, 10, 6, 8);
        System.out.println("Unmodifiable list: " + nList);
        // adding an object will throw an UnsupportedOperationException.

        // A singleton list
        List<String> man = Collections.singletonList("Tony Stark");
        System.out.println("Singleton list: " + man);
    }

    public static void addingTwoLists() {
        List<Integer> numberList = new ArrayList<>(List.of(1, 10, 20, 3, 50));
        List<Integer> numberList2 = new ArrayList<>(List.of(100, 300, 600));
        numberList.addAll(numberList2);
        System.out.println("Added lists: " + numberList);
    }

    public static void listOfLists() {
        List<List<String>> listsOfLists = new ArrayList<>();
        List<String> dogs = new ArrayList<>(Arrays.asList("Rotweiller", "German Shepherd", "Ekuke"));
        listsOfLists.add(dogs);
        List<String> meats = new ArrayList<>(List.of("Beef", "Ham", "Pork"));
        listsOfLists.add(meats);
//        System.out.println("List of Lists: " + listsOfLists);
        listsOfLists.forEach((list) -> { // access each list
           list.forEach((item) -> System.out.print(item + " ")); // access each item in each list
        });
    }
}
