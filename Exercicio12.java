import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valor, total;
        int opcao;

        System.out.print("Digite o valor do produto: ");
        valor = scanner.nextDouble();

        System.out.println("1 - Pix/Dinheiro");
        System.out.println("2 - Cartão à vista");
        System.out.println("3 - Cartão em 2x");
        System.out.println("4 - Cartão em 3x ou mais");
        opcao = scanner.nextInt();

        if (opcao == 1) {
            total = valor * 0.85;
        } else if (opcao == 2) {
            total = valor * 0.90;
        } else if (opcao == 3) {
            total = valor;
        } else {
            total = valor * 1.10;
        }

        System.out.println("Valor final: R$ " + total);

        scanner.close();
    }
}