package jogoadivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();
        int valorJogador = -1, numeroAleatorio = gerador.nextInt(101);
        int vidas = 7;
        do{
            System.out.print("[" + vidas + " vidas] Teste adivinhar o número: ");
            valorJogador = ler.nextInt();

            if(valorJogador == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou (" + valorJogador + " = " + numeroAleatorio + ")");
            } else {
                vidas--;
                if(valorJogador > numeroAleatorio) System.out.println("Menos!");
                else System.out.println("Mais!");
            }
            if(vidas == 0) System.out.println("Suas vidas acabaram! Você perdeu...");
        }while(valorJogador != numeroAleatorio && vidas > 0);
    }
}