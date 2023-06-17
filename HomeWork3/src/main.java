import Solution.Task1;
import Solution.Task2;
import Solution.Task3;

import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Integer> list = Task2.randomList();
        Task1.mergeSort(list);
        System.out.println(list);

        //Task2.removalOfEven(list);
        //Task3.minMax(list);
    }
}
