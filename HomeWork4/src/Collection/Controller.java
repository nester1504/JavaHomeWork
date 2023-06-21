package Collection;

import static Collection.View.*;

public class Controller {

    public static void run() {
        boolean getIteration = true;

        while (getIteration) {
            String cmd = InputUser("Enter the command");
            String[] cLine = cmd.toUpperCase().split("~");

            switch (cLine[0]) {
                case "EXIT":
                    getIteration = false;
                    break;
                case "PRINT":
                    System.out.println(list.get(Integer.parseInt(cLine[1])));
                    break;
                case "LIST":
                    PrintInvertedListPop();
                    break;
                case "REVERSE":
                    PrintInvertedListPeek();
                    break;
                default:
                    if (cLine.length > 1) {
                        if (isInt(cLine[1])) {
                            adder(cLine, list);
                        } else {
                            list.addFirst(cLine[0]);
                        }
                    } else {
                        list.addFirst(cLine[0]);
                    }
                    break;
            }
        }
    }
}
