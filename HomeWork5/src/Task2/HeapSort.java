package Task2;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] array) {
        int n = array.length;

        // Построение max-кучи (пирамиды)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Извлечение элементов из кучи и упорядочивание
        for (int i = n - 1; i >= 0; i--) {
            // Перемещение текущего корня в конец массива
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызов процедуры heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i; // Инициализация наибольшего элемента как корня поддерева
        int left = 2 * i + 1; // Левый дочерний элемент
        int right = 2 * i + 2; // Правый дочерний элемент

        // Если левый дочерний элемент больше корня
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // Если правый дочерний элемент больше корня
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // Если наибольший элемент не является корнем
        if (largest != i) {
            // Обмен значениями
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // Рекурсивно вызываем heapify для поддерева
            heapify(array, n, largest);
        }
    }

}
