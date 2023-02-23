package edu.miguel.conceitos.operadores;

public class Operadores {

  // Simbolos especiais com significado proprio

  public static void main(String[] args) {

    // Atribuição - definir/subtituir o valor de uma variavel - "=" Igual.

    String nome = "Miguel";
    int idade = 27;
    double peso = 94.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
    // Date dataNascimento = new Date();

    // Aritmético -realizar operaçoes matematica entre valores numerico - "+"
    // Adição,"-" Subtração,"*" Multiplicação, "/" Divisão.
    double soma = 10.5 + 15.7;
    int subtração = 113 - 15;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20 / 4);

    // o simbolo de adição pode ser usado para concatenar palavra (juntar)

    String nomeCompleto = "Nome" + "Completo";

    // Lembre-se ao usar adição não deve usar caracteres pois ele vi fazer a
    // conctenação, caso quiser concatenar o caracter com a soma ou qualquer
    // calculo, o calculo tem que estar em Evidencia.

    // Unário -Aplicado com operado aritmetico, ele e capaz de incrementar,
    // descrementar e inverter valores - (+)Positivo,(-) Negativo,(++)incremento
    // ,(--) descremento, (!) negação logica ou booleano

    int numero = 5;
    System.out.println(numero);

    numero = -numero;
    System.out.println(numero);

    numero = numero * 1;/// numeros negativos voltam a ser positivo quando multiplicamos o numero
                        /// negativo por 1
    System.out.println(numero);

    numero = numero++; // igual a numero + 1
    // numero = numero ++; //igual a numero - 1
    System.out.println(numero);
    // incremento ou descremento no momento da impressão, o simbolo de tem que vir
    // na frente pois primeiro faz o incremento/dencremento e depois imprimi
    System.out.println(++numero);
    // System.out.println(-- numero);

    boolean variavel = true;

    variavel = !variavel;

    System.out.println(variavel);
    System.out.println(!variavel);
    System.out.println(variavel);// observe quea negação acima do booleano não alterou o valor original da
                                 // varivel, pois a mesma não foi feita como uma atribuição.

    // Relacional - avaliar relação entre duas variaveis ou expressão -(==)
    // Igualdade,(!=) Diferente, (>) maior, (>=) maior igual, (<) menor, (<=)
    // Logico

    // ternário - definir um condição entre dois ou + valores
    int a, b;

    a = 5;
    b = 6;

    String resultados = a == b ? "Verdadeiro" : "Falso";

    System.out.println(resultados);

  }

}