import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, C, soma;

        System.out.print("Digite o valor de A: ");
        A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        C = scanner.nextInt();

        soma = A + B;

        System.out.println("A soma entre A e B é: " + soma);

        if (soma < C) {
            System.out.println("A soma é menor que C.");
        } else {
            System.out.println("A soma NÃO é menor que C.");
        }

        scanner.close();
    }
}