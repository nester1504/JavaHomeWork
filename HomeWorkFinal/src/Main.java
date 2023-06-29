import Technics.Notebook;
import Technics.Search;

import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Notebook asus1232 = new Notebook(1,"Asus","1232",15.6, 123,512,8,"Windows");
        Notebook hp33p = new Notebook(2,"HP","33p",15.6, 243,256,4,"Windows");
        Notebook acer101 = new Notebook(3,"Acer","101",17.0, 243,512,4,"Windows");

        HashSet<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(asus1232);
        notebookSet.add(hp33p);
        notebookSet.add(acer101);

        asus1232.onPower();
        asus1232.offPower();

        System.out.println(asus1232);

        System.out.println(asus1232.equals(hp33p));

        System.out.println(notebookSet.contains(hp33p));

        Map<String, String> criteria = Search.getFilterCriteria();

        Search.printSearch(criteria, notebookSet);


    }
}
