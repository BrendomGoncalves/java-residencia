package conversortemperatura;

import java.util.Scanner;

public class Conversor{

    public static void main(String[] args) {
        // Declara as variáveis
        double temperatura, resultado;
        char unidade;

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura
        System.out.print("Insira a temperatura: ");
        temperatura = scanner.nextDouble();

        // Solicita ao usuário que insira a unidade de origem
        System.out.print("Insira a unidade de origem (C ou F): ");
        unidade = scanner.next().charAt(0);

        // Realiza a conversão
        if (unidade == 'C') {
            resultado = ((temperatura * 9) / 5) + 32;
            System.out.println("A temperatura em Fahrenheit é " + resultado + " graus Fahrenheit.");
        } else if (unidade == 'F') {
            resultado = ((temperatura - 32) * 5) / 9;
            System.out.println("A temperatura em Celsius é " + resultado + " graus Celsius.");
        } else {
            System.out.println("Unidade inválida.");
        }
    }
}
