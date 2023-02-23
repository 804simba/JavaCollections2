package org.example;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class IteratorConcurrentMod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Tim");
        names.add("Jay");
        names.add("Gary");
        names.add("Hannah");

        try {
            for (Iterator<String> it = names.iterator(); it.hasNext();) {
                String name = it.next();
                if (name.equals("Jay")) {
                    it.remove();
                }
            }
            System.out.println(names);
        } catch(ConcurrentModificationException e) {
            System.out.println("Exception: " + e.getLocalizedMessage());
        }

//        names.removeIf(name -> name.equals("Gary"));
//        System.out.println(names);

    }
}
