import java.util.Scanner;

public class Task1 {

    public static void ScanNumberN() {
        System.out.print("Введите число n = ");
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            System.out.println(SumOfNumbersToN(n));
        }
    }

    public static int SumOfNumbersToN(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum + i;
        }
        return sum;
    }

}
