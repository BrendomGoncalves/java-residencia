### 1. O que é uma exceção em Java e qual é o propósito de usá-las em programas?

````
Mecanismo especial para o tratamento de errosque possam ocorrer em tempo de execução do programa
````

### 2. Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma.

````
Exceções verificadas estão no conhecimento do compilador, enquanto exceções não verificadas não estão no conhecimento do compilador.

- Exceções verificadas:
Exception in thread "main" java.lang.Error:
Unresolved compilation problems: 
    Unhandled exception type FileNotFoundException
	Unhandled exception type IOException
	Unhandled exception type IOException
at SimpleTesting.main(SimpleTesting.java:8)

- Exceções não verificadas:
Exception in thread "main" java.lang ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 5
at SimpleTesting.main(SimpleTesting.java:9)
````

### 3. Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções?

````
- Bloco try / catch
Como a exceção é lançada por toda a cadeia de classes do sistema, a qualquer momento é possível se “pegar” essa exceção e dar a ela o tratamento adequado.
- Palavra-chave throw
Também é possível que você próprio envie uma exceção em alguma situação especifica, como em uma situação de login em que o usuário digita incorretamente sua senha. Para realizarmos tal tarefa é necessária a utilização da palavra-chave throw.
- Bloco finnaly
A palavra-chave finally representa um trecho de código que será sempre executado, independentemente se uma exceção ocorrer
````

### 4. O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções?

````
O try-catch é uma estrutura que permite aos desenvolvedores capturar exceções e tratá-las de forma adequada. A estrutura básica de um bloco try-catch em Java é:
try{
    // código que pode gerar uma exceção
} cath (TipoDaExceção e) {
    // tratamento da exceção
}
````

### 5. Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada.

````
Com o seguinte código:

class NumeroNegativoException extends Exception  /* RuntimeException */{
    /**
     * importante caso a exceção seja serializada
     */
    private static final long serialVersionUID = 1149241039409861914L;

    // constrói um objeto NumeroNegativoException com a mensagem passada por parâmetro
    public NumeroNegativoException(String msg){
        super(msg);
    }

    // contrói um objeto NumeroNegativoException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public NumeroNegativoException(String msg, Throwable cause){
        super(msg, cause);
    }
}
````