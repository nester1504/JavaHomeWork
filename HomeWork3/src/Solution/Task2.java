package Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {

    public static List<Integer> randomList(){
        Random rd = new Random();
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integerList.add(rd.nextInt(100));
        }
        System.out.println(integerList);
        return integerList;
    }

    public static void removalOfEven(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0)
            {
                list.remove(i);
            }
        }
        System.out.println(list);
    }

}
