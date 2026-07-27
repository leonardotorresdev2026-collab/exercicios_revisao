import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean valor1, valor2;

        System.out.print("Digite o primeiro valor (true ou false): ");
        valor1 = scanner.nextBoolean();

        System.out.print("Digite o segundo valor (true ou false): ");
        valor2 = scanner.nextBoolean();

        if (valor1 && valor2) {
            System.out.println("Ambos são VERDADEIROS.");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos são FALSOS.");
        } else {
            System.out.println("Um é verdadeiro e o outro é falso.");
        }

        scanner.close();
    }
}