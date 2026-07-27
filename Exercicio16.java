import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double f, c;

        System.out.print("Temperatura em Fahrenheit: ");
        f = scanner.nextDouble();

        c = (5 * (f - 32)) / 9;

        System.out.println("Fahrenheit: " + f);
        System.out.println("Celsius: " + c);

        scanner.close();
    }
}