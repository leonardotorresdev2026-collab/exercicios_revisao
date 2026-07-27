import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Digite seu peso (kg): ");
        peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Condição: Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Condição: Peso ideal (parabéns)");
        } else if (imc <= 29.9) {
            System.out.println("Condição: Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Condição: Obesidade grau I");
        } else if (imc <= 39.9) {
            System.out.println("Condição: Obesidade grau II (severa)");
        } else {
            System.out.println("Condição: Obesidade grau III (mórbida)");
        }

        scanner.close();
    }
}