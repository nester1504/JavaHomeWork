package Solution;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void minMax(List<Integer> arr){
        System.out.println("Минимальное значение = " + Collections.min(arr));
        System.out.println("Максимальное значение = " + Collections.max(arr));

            int sum = 0;
            for (int number : arr) {
                sum += number;
            }
        System.out.println("Среднее значение = "  + sum / arr.size());
    }

}
