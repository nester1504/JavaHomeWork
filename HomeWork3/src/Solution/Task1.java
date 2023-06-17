package Solution;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return; // Список уже отсортирован или пустой
        }

        int mid = list.size() / 2;
        List<Integer> left = new ArrayList<>(list.subList(0, mid));
        List<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(left, right, list);
    }

    public static void merge(List<Integer> left, List<Integer> right, List<Integer> list) {
        int leftLength = left.size();
        int rightLength = right.size();
        int i = 0; // Индекс для левого списка
        int j = 0; // Индекс для правого списка
        int k = 0; // Индекс для объединенного списка

        while (i < leftLength && j < rightLength) {
            if (left.get(i) <= right.get(j)) {
                list.set(k, left.get(i));
                i++;
            } else {
                list.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            list.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < rightLength) {
            list.set(k, right.get(j));
            j++;
            k++;
        }
    }

}
