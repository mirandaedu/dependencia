import java.util.*;

import java.util.Scanner;

public class Questao211{

  public static void main(String args[]){ 

    Scanner sc = new Scanner(System.in);

    int a, b, soma;

    

    System.out.print("Informe o primeiro valor: ");

    a = sc.nextInt();

    System.out.print("Informe o segundo valor: ");

    b = sc.nextInt();

    

    soma=a+b;

    

    if(soma>=10){

      System.out.println("\nSoma + 5 é igual a "+(soma+5));

    }

    if(soma<=10){

      System.out.println("\nSoma - 7 é igual a "+(soma-7));

    }

  }

}
