package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static Collection.View.list;

public class View {

    public static LinkedList<String> list = new LinkedList<>();

    public static String InputUser(String message) {
        System.out.print(message + " -> ");
        Scanner scannerNumber = new Scanner(System.in);
        return scannerNumber.nextLine();
    }

    public static boolean isInt(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static List<String> adder(String[] splitted, List<String> list) {
        if (isInt(splitted[1])) {
            int num = Integer.parseInt(splitted[1]);
            if (num > list.size()) {
                for (int i = list.size() - num; i < num + 1; ++i) {
                    list.add(" ");
                }
            }
            list.add(num, splitted[0]);
        }
        return list;
    }

    public static void PrintInvertedListPop() {
        while (list.size() > 0) {
            System.out.println(list.pop());
        }
    }

    public static void PrintInvertedListPeek() {
        Collections.reverse(list);
        System.out.println(list);

        //for (int i = list.size() - 1; i >= 0; i--) {
        //    System.out.println(list.get(i));
        // }
    }

}
