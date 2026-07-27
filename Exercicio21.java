import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorHora, salarioBruto, salarioLiquido;
        int aulas;
        double aliquota = 0;
        double parcela = 0;
        double desconto;

        System.out.print("Valor da hora-aula: R$ ");
        valorHora = scanner.nextDouble();

        System.out.print("Quantidade de aulas no mês: ");
        aulas = scanner.nextInt();

        salarioBruto = valorHora * aulas;

        if (salarioBruto <= 1621.00) {
            aliquota = 0.075;
            parcela = 0;
        } else if (salarioBruto <= 2902.84) {
            aliquota = 0.09;
            parcela = 24.32;
        } else if (salarioBruto <= 4354.27) {
            aliquota = 0.12;
            parcela = 111.40;
        } else if (salarioBruto <= 8475.55) {
            aliquota = 0.14;
            parcela = 198.49;
        }

        desconto = (salarioBruto * aliquota) - parcela;
        salarioLiquido = salarioBruto - desconto;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto do INSS: R$ " + desconto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}