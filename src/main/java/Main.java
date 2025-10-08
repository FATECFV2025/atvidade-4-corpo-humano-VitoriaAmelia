package main.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada dos dados

        System.out.print("Digite a massa inicial (kg): ");
        double massaInicial = entrada.nextDouble();

        System.out.print("Digite o volume inicial (m³): ");
        double volumeInicial = entrada.nextDouble();

        System.out.print("Digite a densidade inicial (kg/m³): ");
        double densidadeInicial = entrada.nextDouble();

        System.out.print("Digite a altura inicial (m): ");
        double alturaInicial = entrada.nextDouble();

        // Criação do objeto CorpoHumano

        CorpoHumano corpo = new CorpoHumano(massaInicial, volumeInicial, densidadeInicial, alturaInicial);

        // Exibição dos valores na tela
        System.out.println("=== VALORES INICIAIS ===");
        System.out.println("Massa: " + corpo.getMassa() + " kg");
        System.out.println("Volume: " + corpo.getVolumeCorpo() + " m³");
        System.out.println("Densidade: " + corpo.getDensidadeCorpo() + " kg/m³");
        System.out.println("Altura: " + corpo.getAlturaPessoa() + " m");
        System.out.println("IMC: " + corpo.calcularIMC());

        // Atualização com novos valores
        System.out.print("Digite uma nova massa (kg): ");
        corpo.setMassa(entrada.nextDouble());

        System.out.print("Digite uma nova altura (m): ");
        corpo.setAlturaPessoa(entrada.nextDouble());
        
        // Exibição dos novos valores
        System.out.println("Novos valores:");
        System.out.println("Massa: " + corpo.getMassa() + " kg");
        System.out.println("Altura: " + corpo.getAlturaPessoa() + " m");
        System.out.println("Novo IMC: " + corpo.calcularIMC());

        entrada.close();
    }
}

