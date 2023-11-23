package calculadoradivisao;

public class Calculadora {
    public Calculadora() {}
    public float Soma(float x, float y){
        return x + y;
    }
    public float Subtracao(float x, float y){
        return x - y;
    }
    public float Multiplicacao(float x, float y){
        return x * y;
    }
    public float Divisao(float x, float y){
        try{
            return x / y;
        } catch(Exception e){
            System.out.println("Essa operacao nao eh possivel!");
        }
        return 0;
    }
}
