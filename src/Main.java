import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double[] numbers = {5.6, -1.6, -3.5, 7.9, -6.5, 3.4, 7.8, 5.1, -9.4, 5.9, 4.2, 1.8, 6.6, -3.1, 8.7};
        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        for (double number : numbers) {
            if (foundNegative && number > 0) {
                sum += number;
                count++;
            } else if (!foundNegative && number < 0) {
                foundNegative = true;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println(average);

        }
    }
}
