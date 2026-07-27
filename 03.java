import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite o valor de A: ");
        A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        B = scanner.nextInt();

        if (A == B) {
            C = A + B;
        } else {
            C = A * B;
        }

        System.out.println("Valor de C: " + C);

        scanner.close();
    }
}