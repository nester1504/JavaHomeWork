
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task4 {

    public static Logger logger = Logger.getLogger(Task4.class.getName());

        public static void calculator() {
            double number1;
            double number2;
            double result;
            char operator;

            try (Scanner reader = new Scanner(System.in)) {
                System.out.println("Введите два числа");
                number1 = reader.nextDouble();
                number2 = reader.nextDouble();
                System.out.print("\nВведите арифметическое действие (+, -, *, /): ");
                operator = reader.next().charAt(0);
            }

            // Создание и настройка FileHandler
            try {
                FileHandler fileHandler = new FileHandler("calculator.log");
                fileHandler.setLevel(Level.INFO);
                logger.addHandler(fileHandler);
            } catch (Exception e) {
                logger.info("Ошибка при настройке FileHandler");
            }


            switch (operator) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
                default:
                    logger.info("Извините, такого арифметического действия НЕТ!!!");
                    return;
            }

            logger.info("Результат арифметического действия:");
            logger.info(number1 + " " + operator + " " + number2 + " = " + result);
        }
    }


