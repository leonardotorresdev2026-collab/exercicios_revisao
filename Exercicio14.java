import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A, B, aux;

        System.out.print("A: ");
        A = scanner.nextInt();

        System.out.print("B: ");
        B = scanner.nextInt();

        aux = A;
        A = B;
        B = aux;

        System.out.println("Novo A: " + A);
        System.out.println("Novo B: " + B);

        scanner.close();
    }
}