package papka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.println("Введите номер операции: 1. Сложение 2. Вычитание 3. Умножение");
        int num3 = in.nextInt();

        switch (num3) {
            case 1:
                num3 = num1 + num2;
                System.out.printf("Результат операции: %d", num3);
                break;
            case 2:
                num3 = num1 - num2;
                System.out.printf("Результат операции: %d", num3);
                break;
            case 3:
                num3 = num1 * num2;
                System.out.printf("Результат операции: %d", num3);
                break;
            default:
                System.out.print("Операция не определена");
        }
    }
}