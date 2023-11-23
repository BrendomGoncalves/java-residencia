package conversormoedas;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float taxaCambio, qDolares;

        System.out.println("Conversao de Dolares em Reais");
        System.out.print("Digite a taxa de cambio: ");
        taxaCambio = ler.nextFloat();
        System.out.print("Digite a quantidade em Dolares: ");
        qDolares = ler.nextFloat();

        System.out.println("O valor $" + qDolares + " eh R$" + qDolares*taxaCambio + ".");
    }
}