import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A, B;

        System.out.print("Digite A: ");
        A = scanner.nextInt();

        System.out.print("Digite B: ");
        B = scanner.nextInt();

        System.out.println("Quociente: " + (A / B));
        System.out.println("Resto: " + (A % B));

        scanner.close();
    }
}