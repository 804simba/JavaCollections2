package org.example.lambdaexps;


@java.lang.FunctionalInterface
interface Square {
    int calculate(int x);
}

class FunctionalInterface {

    public static void main(String[] args) {
        int a = 4;
        Square s = (int x) -> x * x;

        int res = s.calculate(a);
        System.out.println(res);
    }
}
