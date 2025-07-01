class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class Adddiv {
    public static void main(String[] args) {
        Calculator ParthCalc = new Calculator();

        int a = 10, b = 2;

        System.out.println("Parth's Add: " + ParthCalc.add(a, b));
        System.out.println("Parth's Subtract: " + ParthCalc.subtract(a, b));
        System.out.println("Parth's Multiply: " + ParthCalc.multiply(a, b));
        System.out.println("Parth's Divide: " + ParthCalc.divide(a, b));
    }
}
