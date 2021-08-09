package papka;

import java.util.Scanner;

public class Main {
//  Константа на уровне класса
    public static final String RESULT_PATTERN = "Результат операции: %d";

    public static void main(String[] args) {
//        Константа на уровне метода. Можно использовать её, но лучше выносить константу на уровень класса
//        final String RESULT_PATTERN = "Результат операции: %d";

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        final int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        final int num2 = in.nextInt();

        System.out.println("Введите номер операции: 1. Сложение 2. Вычитание 3. Умножение");
        int result;

        switch (in.nextInt()) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            default:
                System.out.print("Операция не определена");
                return;
        }

        System.out.printf(RESULT_PATTERN, result);
    }
}