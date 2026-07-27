import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("Lado 1: ");
        a = scanner.nextDouble();

        System.out.print("Lado 2: ");
        b = scanner.nextDouble();

        System.out.print("Lado 3: ");
        c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {

            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }

        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        scanner.close();
    }
}