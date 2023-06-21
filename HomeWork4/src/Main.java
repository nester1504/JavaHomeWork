import Collection.Controller;
import Collection.Task;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Controller.run();
        LinkedList<String> linkList = new LinkedList<>();

        linkList.add("Водород");
        linkList.add("Гелий");
        linkList.add("Литий");
        linkList.add("Бериллий");

        Task.turn(linkList);

    }
}
