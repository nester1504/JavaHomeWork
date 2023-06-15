import java.util.Scanner;

public class Task3 {


    public static void Сalculator() {
        double number1;
        double number2;
        double result;
        char operator;
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Введите два числа");
            number1 = reader.nextDouble();
            number2 = reader.nextDouble();
            System.out.print("\n Введите арифметические действия (+, -, *, /): ");
            operator = reader.next().charAt(0);
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
                System.out.printf("Извините такого арифметического действия НЕТ!!!");
                return;
        }
        System.out.print("\nРезультат арифметического действия:\n");
        System.out.printf(number1 + " " + operator + " " + number2 + " = " + result);
    }
}
