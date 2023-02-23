package org.example;

public class Staff implements Comparable<Staff>{
    private final Long time = System.currentTimeMillis();

    @Override
    public int compareTo(Staff o) {
        return 0;
    }
}
