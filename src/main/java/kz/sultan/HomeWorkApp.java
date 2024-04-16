package kz.sultan;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreewords();
        checkSumSign(5, 6);
        printColor(3);
        compareNumbers(0, 10);
    }

    public static void printThreewords() {
        System.out.println("\nOrange");
        System.out.println("Banana");
        System.out.println("Apple\n");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Positive");
        } else if (a + b < 0) {
            System.out.println("Negative");
        }

    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }

    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}