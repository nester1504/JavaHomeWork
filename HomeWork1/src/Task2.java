public class Task2 {

    public static void PrimeNumbers(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(i + " ");
            isPrime = true;
        }
    }
}
