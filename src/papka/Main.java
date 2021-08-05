package papka;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    int num1, num2;
        System.out.println("Please, Enter namber1: ");
        num1 = a.nextInt();
        System.out.println("Please, Enter namber2: ");
        num2 = a.nextInt();
        if(num1==num2) {
            System.out.println("Two numbers ravni");
        }
        if(num1<num2) {
            System.out.println("Number1 menshe number2");
        }
        if(num1>num2){
            System.out.println("Number1 bolshe numer2");
        }
    }
}
