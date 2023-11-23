package calculadoradivisao;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.Soma(5, 5));
        System.out.println(calc.Subtracao(10, 9));
        System.out.println(calc.Multiplicacao(3, 4));
        System.out.println(calc.Divisao(4, 0));
    }
}
