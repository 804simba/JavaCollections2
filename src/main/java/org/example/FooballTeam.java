package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FooballTeam {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        Player p1 = new Player(12, "Messi", 34);
        Player p2 = new Player(1, "Cristiano Ronaldo", 38);
        Player p3 = new Player(6, "Kylian Mbappe", 23);
        Player p4 = new Player(100, "Mo Salah", 28);
        Player p5 = new Player(34, "Luka Modric", 30);

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);

        System.out.println("Before sorting..." + players);
        Collections.sort(players, new PlayerRankingComparator());
//        players.sort(new PlayerRankingComparator());
        System.out.println("After sorting...");
        players.forEach(player -> System.out.printf("Name: %s, Rank: %d\n", player.getName(), player.getRanking()));
        System.out.println();

        System.out.println("Age sorting of players...");
        players.sort(new PlayerAgeComparator());
        for (Player player : players) {
            String details = String.format("Name: %s, Age: %d", player.getName(), player.getAge());
            System.out.println(details);
        }
    }
}
