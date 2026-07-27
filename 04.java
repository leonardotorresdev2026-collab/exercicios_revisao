import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        System.out.println("Antecessor: " + (numero - 1));
        System.out.println("Sucessor: " + (numero + 1));

        scanner.close();
    }
}