import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.print("Введите число n = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(SumOfNumbersToN(n));

    }

    private static int SumOfNumbersToN(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
