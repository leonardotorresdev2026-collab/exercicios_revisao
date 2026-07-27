import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tempo, velocidade, distancia, litros;

        System.out.print("Tempo da viagem (horas): ");
        tempo = scanner.nextDouble();

        System.out.print("Velocidade média (km/h): ");
        velocidade = scanner.nextDouble();

        distancia = tempo * velocidade;
        litros = distancia / 12;

        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros gastos: " + litros + " litros");

        scanner.close();
    }
}