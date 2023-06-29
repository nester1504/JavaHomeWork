package Technics;

import java.util.*;

public class Search {

    public static Map<String, String> getFilterCriteria() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> criteria = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - Компания производитель");
        System.out.println("2 - Диагональ монитора");
        System.out.println("3 - ОС");

        int choice = scanner.nextInt();
        scanner.nextLine();


        switch (choice) {
            case 1:
                System.out.println("Выбирите компанию производитель: ");
                System.out.println("1 - Asus");
                System.out.println("2 - Acer ");
                System.out.println("3 - HP");
                int companyChoice = scanner.nextInt();
                scanner.nextLine(); // Считываем перевод строки после ввода числа

                switch (companyChoice) {
                    case 1:
                        criteria.put("Компания производитель", "Asus");
                        break;
                    case 2:
                        criteria.put("Компания производитель", "Acer");
                        break;
                    case 3:
                        criteria.put("Компания производитель", "HP");
                        break;
                    default:
                        System.out.println("Некорректный выбор компании.");
                        break;
                }
                break;

            case 2:
                System.out.println("Выбирите диагональ монитора: ");
                System.out.println("1 - 15.6");
                System.out.println("2 - 17");
                System.out.println("3 - 19");
                int monitorChoice = scanner.nextInt();
                scanner.nextLine(); // Считываем перевод строки после ввода числа

                switch (monitorChoice) {
                    case 1:
                        criteria.put("Диагональ монитора", "15.6");
                        break;
                    case 2:
                        criteria.put("Диагональ монитора", "17");
                        break;
                    case 3:
                        criteria.put("Диагональ монитора", "19");
                        break;
                    default:
                        System.out.println("Некорректный набор диагонали.");
                        break;
                }
                break;

            case 3:
                System.out.println("Напечатайте ОС: ");
                System.out.println("1 - Windows");
                System.out.println("2 - MacOS");
                System.out.println("3 - Linux");
                int osChoice = scanner.nextInt();
                scanner.nextLine(); // Считываем перевод строки после ввода числа
                switch (osChoice) {
                    case 1:
                        criteria.put("ОС", "Windows");
                        break;
                    case 2:
                        criteria.put("ОС", "MacOS");
                        break;
                    case 3:
                        criteria.put("ОС", "Linux");
                        break;
                    default:
                        System.out.println("Некорректный набор диагонали.");
                        break;

                }
                break;

            default:
                System.out.println("Некорректный выбор критерия.");
                break;

        }

        return criteria;
    }

    private static boolean checkNotebookMatchesFilter(Notebook notebook, Map<String, String> filter) {
        for (Map.Entry<String, String> entry : filter.entrySet()) {
            String criterion = entry.getKey();
            String value = entry.getValue();

            // Проверяем каждый критерий фильтрации
            switch (criterion) {
                case "Компания производитель":
                    if (!notebook.getCompany().equalsIgnoreCase(value)) {
                        return false;
                    }
                    break;
                case "Диагональ монитора":
                    double diagonal = Double.parseDouble(value);
                    if (notebook.getMonitorDiagonal() != diagonal) {
                        return false;
                    }
                    break;
                case "ОС":
                    if (!notebook.getOs().equalsIgnoreCase(value)) {
                        return false;
                    }
                    break;
                default:
                    System.out.println("Некорректный критерий фильтрации: " + criterion);
                    return false;
            }
        }

        return true; // Ноутбук соответствует всем критериям фильтра
    }

    public static void printSearch(Map<String, String> filter, HashSet<Notebook> notebookSet) {
        System.out.println("Результаты поиска:");

        for (Notebook notebook : notebookSet) {
            if (checkNotebookMatchesFilter(notebook, filter)) {
                System.out.println(notebook);
            }
        }
    }
}




