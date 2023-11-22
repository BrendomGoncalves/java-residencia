### O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java.

Em Java, uma classe é um tipo de dados abstrato que define um conjunto de atributos e métodos que podem ser usados para representar um objeto do mundo real.
<br>A principal diferença entre uma classe e um objeto é que uma classe é um tipo de dados abstrato, enquanto um objeto é uma instância de uma classe. Isso significa que uma classe pode ser usada para criar vários objetos, cada um com seus próprios valores e comportamentos.

### C++

`````c++

class Pessoa {
public:
  string nome;
  int idade;
  char sexo;

  void andar() {
    cout << "Estou andando." << endl;
  }

  void falar() {
    cout << "Estou falando." << endl;
  }
};

int main() {
  // Cria um objeto de tipo Pessoa
  Pessoa p1;

  // Atribui valores aos atributos do objeto
  p1.nome = "João";
  p1.idade = 30;
  p1.sexo = 'M';

  // Chama os métodos do objeto
  p1.andar();
  p1.falar();

  return 0;
}

`````

### JAVA

````java

class Pessoa {
    String nome;
    int idade;
    char sexo;

    void andar() {
        System.out.println("Estou andando.");
    }

    void falar() {
        System.out.println("Estou falando.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Cria um objeto de tipo Pessoa
        Pessoa p1 = new Pessoa();

        // Atribui valores aos atributos do objeto
        p1.nome = "João";
        p1.idade = 30;
        p1.sexo = 'M';

        // Chama os métodos do objeto
        p1.andar();
        p1.falar();
    }
}

````

### Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++

````java
// JAVA
int nomeDoInteiro;
String nomeDaString;
````

````c++
// C++
int nomeDoInteiro;
string nomeDaString;
````

|      Tipo de dado       |  JAVA   | C++      |
|     :------------:      |:-------:| :------: |
|           Int           |   int   | int      |
|         double          | double  | double   |
|          char           |  char   | char     |
|         boolean         | boolean | bool     |
|         String          | String  | string   |

### Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos.

A herança é um mecanismo de programação orientada a objetos que permite que uma classe herde os atributos e métodos de outra classe. A classe que herda é chamada de subclasse, e a classe herdada é chamada de superclasse.

````java
// JAVA
class Veiculo {
  String marca;
  String modelo;
}
class Carro extends Veiculo {
    // Atributos e métodos específicos do carro
}
````

`````c++
// C++
class Vehicle {
  string brand;
  string model;
};
class Car : public Vehicle {
  // Atributos e métodos específicos do carro
};
`````

#### Java

- Animal é uma superclasse que define os atributos nome e idade.
- Cachorro é uma subclasse de Animal que define o atributo raça.
- Gato é uma subclasse de Animal que define o atributo cor.

#### C++

- Animal é uma superclasse que define os atributos name e age.
- Dog é uma subclasse de Animal que define o atributo breed.
- Cat é uma subclasse de Animal que define o atributo color.

### Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente. Discorra sobre esse aspecto.

Em Java, sempre que declaramos uma variável, estamos criando um ponteiro para um objeto. Esse ponteiro é chamado de referência. As referências são gerenciadas automaticamente pelo coletor de lixo (garbage collector), o que significa que o desenvolvedor não precisa se preocupar com a liberação de memória.
<br>Em C++, por outro lado, as variáveis podem ser declaradas como ponteiros ou como referências. Os ponteiros são variáveis que armazenam o endereço de memória de um objeto. Os ponteiros precisam ser gerenciados manualmente pelo desenvolvedor, o que significa que é necessário liberar a memória alocada para eles quando não forem mais necessários.