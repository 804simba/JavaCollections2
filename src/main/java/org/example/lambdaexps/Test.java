package org.example.lambdaexps;

public class Test {
    // https://www.geeksforgeeks.org/lambda-expressions-java-8/
    interface FuncInter1 {
        int operation(int a, int b);
    }

    interface FuncInter2 {
        void sayMessage(String message);
    }

    private int operate(int a, int b, FuncInter1 fobj) {
        return fobj.operation(a, b);
    }

    public static void main(String[] args) {
        FuncInter1 add = Integer::sum;
//        FuncInter1 add = (int a, int b) -> a + b;

        FuncInter1 multiply = (int a, int b) -> a * b;

        Test testObj = new Test();

        System.out.println("Addition is: " + testObj.operate(2, 4, add));

        System.out.println("Multiplication is: " + testObj.operate(20, 4, multiply));

        FuncInter2 fObj2 = message -> System.out.println("Hello " + message);

        fObj2.sayMessage("Timothy!");
    }
}
