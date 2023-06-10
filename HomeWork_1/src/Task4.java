public class Task4 {

    public static void SolveEquation() {
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                if (IsValidSolution(Integer.toString(q), Integer.toString(w), 69)) {
                    System.out.println("2" + q + " + " + w + "5" + " = " + 69);
                    return; // Найдено одно решение, можно завершить выполнение
                }

            }
        }
        System.out.println("Решение не найдено.");
    }

    public static boolean IsValidSolution(String q, String w, int e) {
        int number1 = Integer.parseInt("2" + q);
        int number2 = Integer.parseInt(w + "5");
        return (number1 + number2) == e;
    }

}
