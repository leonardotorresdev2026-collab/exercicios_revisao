import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor, reajuste;

        System.out.print("Digite um valor: ");
        valor = scanner.nextDouble();

        reajuste = valor + (valor * 0.05);

        System.out.println("Valor com reajuste de 5%: " + reajuste);

        scanner.close();
    }
}