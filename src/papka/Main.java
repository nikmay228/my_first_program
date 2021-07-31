package papka;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input namber1: ");
        int namber1 = in.nextInt();
        System.out.print("Input namber2: ");
        int namber2 = in.nextInt();
        int namber3 = namber1 + namber2;
        System.out.printf("Namber3: %d", namber3);
    }
}