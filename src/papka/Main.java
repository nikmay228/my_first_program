package papka;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = -8;
//число -8 в двоичной системе
        System.out.println(Integer.toBinaryString(i));
//обратыный перевод из двоичной системы в десятичную
        System.out.println(Integer.parseInt("11111111111111111111111111111000", 2));
    }
}