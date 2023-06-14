import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task2 {

    public static Logger logger = Logger.getLogger(Task2.class.getName());

    public static void bubbleSort(int[] array) {

        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен значениями
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    logger.info("Обмен " + (i + 1) + ": " + Arrays.toString(array));
                }
            }

            // Если внутренний цикл не выполнил ни одной перестановки,
            // значит массив уже отсортирован, можно прервать внешний цикл
            if (!swapped) {
                break;
            }
        }
    }

}
