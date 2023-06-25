package Task3;

public class Queens {
        private static final int SIZE = 8;
        private static int[] queens = new int[SIZE];

        public static void placeQueens(int row) {
            if (row == SIZE) { // Если достигнута последняя строка (расстановка всех ферзей)
                printQueens(); // Вывести расстановку ферзей
                return;
            }

            for (int col = 0; col < SIZE; col++) {// Проход по всем столбцам в текущей строке
                if (isSafe(row, col)) { // Проверка безопасности текущей позиции ферзя
                    queens[row] = col; // Расстановка ферзя в текущую позицию
                    placeQueens(row + 1); // Рекурсивное продолжение расстановки ферзей в следующей строке
                }
            }
        }

        private static boolean isSafe(int row, int col) {
            for (int i = 0; i < row; i++) {
                if (queens[i] == col || queens[i] - queens[row] == i - row || queens[i] - queens[row] == row - i) {
                    // Если ферзь уже находится в текущем столбце или на одной из диагоналей с текущим ферзем,
                    // то текущая позиция небезопасна
                    return false;
                }
            }
            return true; // Текущая позиция безопасна
        }

        private static void printQueens() {
            for (int row = 0; row < SIZE; row++) {
                for (int col = 0; col < SIZE; col++) {
                    if (queens[row] == col) {
                        System.out.print("Q "); // Вывод "Q" для позиции с ферзем
                    } else {
                        System.out.print(". "); // Вывод "." для пустой позиции
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

