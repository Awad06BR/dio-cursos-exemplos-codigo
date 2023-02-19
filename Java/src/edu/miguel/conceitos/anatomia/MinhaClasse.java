package edu.miguel.anatomia;

public class MinhaClasse {

  public static void main(String[] args) {

    int numeroUm = 2;
    int numero2 = 3;
    int resultado = somar(numeroUm, numero2);

    System.out.println(resultado);

  }

  // Metodo que soma dois numeros passado como parametros
  public static int somar(int numeroUm, int numero2) {
    return numeroUm + numero2;
  }
}
