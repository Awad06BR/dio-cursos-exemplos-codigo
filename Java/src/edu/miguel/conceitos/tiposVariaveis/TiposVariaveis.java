package edu.miguel.conceitos.tiposVariaveis;

public class TiposVariaveis {

  public static void main(String[] args) {

    // Tipos

    // int (1,2,3,4,5,6,7,8,9,0) - Mais Comum
    int numero = 1;
    // byte (123,345,678,901)
    byte sequecial = 123;
    // short = (2021,2022,2386)
    short ano = 2023;
    // long (987654321L, 321654987L)
    long codigo = 12356798018L;
    // float (1.25F; 4.50F; 1.2F)
    float salarioMinimo = 1380.15F;
    // double (1.5, 1.89,25.6) - Mais Comum
    double salarioMin = 1380.15;
    // boolean (false ou true)
    boolean verdadeiro = true;
    // char (“C”)
    char letraInicial = 'M';

    // Variaveis vs Constante

    // Variaveis- seus valores podem ser alterado durante o processo

    int numeroEscolhido = 15;

    numeroEscolhido = 10;

    System.out.print(numeroEscolhido);

    // Constante - não permite alterar valor, nome em caixa alta e adicionado final
    // antes da declaração da constante

    final double NUMERO_PI = 3.14;

    // NUMERO_PI = 2.5; // erro pois é uma constante!!!

    System.out.print(NUMERO_PI);

    // Java é fortemente TIPADO, então temos que ter cuidado ao escolher o tipo para
    // os dados que iremos trabalhar.

    short numeroSimples = 1; // Declaramos um short igual a 1 - Aceito
    int numeroNormal = numeroSimples; // declaramos um int igual a short - Aceito
    // short numeroSimples2 = numeroNormal;// Erro ao declara um short igual a int,
    // pois em algum momento o valor da
    // variavel int não será suportado pelo short.

  }

}
