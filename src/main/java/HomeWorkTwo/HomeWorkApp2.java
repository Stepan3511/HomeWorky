package HomeWorkTwo;

public class HomeWorkApp2 {

    public static void main(String[] args) {

        System.out.println(verifySumLimit(15, 1));
        positiveOrNegative(1);
        System.out.println(isPositivOrNegativ(5));
        printWord("slova", 5);
    }

    public static boolean verifySumLimit(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void positiveOrNegative (int a) {
        if (a > 0) {
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число положительное");
        }
    }

    public static boolean isPositivOrNegativ (int a) {
        return a > 0;
    }

    public static void printWord (String word, int times) {
        for (times = 0; times < 5; times++)
            System.out.println(word);
    }

}