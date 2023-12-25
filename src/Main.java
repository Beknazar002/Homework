public class Main {
    public static void main(String[] args) {
        int result1 = goForWalk(25, 20);
        int result2 = goForWalk(18, 25);
        int result3 = goForWalk(50, 15);
        int result4 = goForWalk(30, 10);
        int result5 = goForWalk(40, 5);

        printResult(result1);
        printResult(result2);
        printResult(result3);
        printResult(result4);
        printResult(result5);
    }

    public static int goForWalk(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return 1; // "Можно идти гулять"
        } else {
            return 0; // "Оставайтесь дома"
        }
    }

    public static void printResult(int result) {
        if (result == 1) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
    }
}