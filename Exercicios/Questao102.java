import java.util.*;

import java.util.Scanner;

 public class Questão102{

   public static void main(String args[]){ 

     

     int a, b;

     int soma, subtr, multi, divi;

     Scanner c = new Scanner(System.in);

     

     System.out.print("Entre com o primeiro número: ");

     a = c.nextInt(); 

     System.out.print("Entre com o segundo número: ");

     b = c.nextInt();

     

     System.out.println("");

    

     soma = a + b;

     System.out.println("Resultado da soma: " + soma);

     subtr = a - b;

     System.out.println("Resultado da subtração: " + subtr);

     multi = a * b;

     System.out.println("Resultado da multiplicação: " + multi);

     divi = a / b;

     System.out.println("Resultado da divisão: " + divi);

   }

 }
