import java.util.*;

import java.util.Scanner;

public class Questao212{

  public static void main(String args[]){ 

    Scanner sc = new Scanner(System.in);

    double a, b;

    

    System.out.print("Digite um valor: ");

    a = sc.nextDouble();

    

    System.out.print("Digite outro valor: ");

    b = sc.nextDouble();

    

    System.out.print("Informe que tipo de operação você quer realizar: ");

    String operacao = sc.next();

    

   switch(operacao){

     case "+":

       System.out.print(a+b);

       break;

     case "-":

       System.out.print(a-b);

       break;

     case "*":

       System.out.print(a*b);

       break;

     case "/":

       System.out.print(a/b);

       break;

     default:

       System.out.println("Operação inválida");

       break;

   }

  }

}

