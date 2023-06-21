package Collection;

import java.util.LinkedList;


public class Task {


    public static void turn (LinkedList<String> list)
    {
        System.out.println(list);
        enqueue(list);
        System.out.println(list);
        dequeue(list);
        System.out.println(list);
        first(list);
    }
    private static void enqueue(LinkedList<String> list) {
        list.addLast(list.get(0));
        list.removeFirst();
    }

    private static void dequeue(LinkedList<String> list) {
        System.out.println(list.peekFirst());
        list.removeFirst();
    }


    private static void first(LinkedList<String> list) {
        System.out.println(list.peekFirst());
    }
}
