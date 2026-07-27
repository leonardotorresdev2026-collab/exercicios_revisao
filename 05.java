import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioUsuario;
        double salarioMinimo = 1621.00;
        double quantidade;

        System.out.print("Digite seu salário: R$ ");
        salarioUsuario = scanner.nextDouble();

        quantidade = salarioUsuario / salarioMinimo;

        System.out.println("Você recebe " + quantidade + " salários mínimos.");

        scanner.close();
    }
}