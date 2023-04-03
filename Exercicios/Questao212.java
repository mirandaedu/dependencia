import java.util.*;

import java.util.Scanner;

public class Questao212{

  public static void main(String args[]){ 

    Scanner sc = new Scanner(System.in);

    double a, b;

    double adicao, subtr, mult, divi;

    

    System.out.print("Digite um valor: ");

    a = sc.nextDouble();

    

    System.out.print("Digite outro valor: ");

    b = sc.nextDouble();

    

    System.out.print("Informe que tipo de operação você quer realizar: ");

    String operacao = sc.next();

    

    adicao=a+b;

    subtr=a-b;

    mult=a*b;

    divi=a/b;

    

   switch(operacao){

     case "+":

       System.out.print(adicao);

       break;

     case "-":

       System.out.print(subtr);

       break;

     case "*":

       System.out.print(mult);

       break;

     case "/":

       System.out.print(divi);

       break;

     default:

       System.out.println("Operação inválida");

       break;

   }

  }

}
