package org.example;

public class Player {
        private int ranking;
        private String name;
        private int age;

        public Player(int ranking, String name, int age) {
            this.ranking = ranking;
            this.name = name;
            this.age = age;
        }

    public String getName() {
        return name;
    }

    public int getRanking() {
            return ranking;
        }

        public int getAge() {
            return age;
        }

    @Override
    public String toString() {
        return super.toString();
    }
}
