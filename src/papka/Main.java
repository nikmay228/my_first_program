package papka;

public class Main {

    public static void main(String[] args) {
        decrementExample();
    }

    static void decrementExample() {
        int firstDigit = 4;

        int result = --firstDigit;
        System.out.printf("result=%d, firstFigit=%d", result, firstDigit);
    }

}