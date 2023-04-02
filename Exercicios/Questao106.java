import java.util.*;

import java.util.Scanner;

 public class Questao106{

   public static void main(String args[]){ 

     double f;

     double c;

     Scanner scn = new Scanner(System.in);

    

     System.out.print("Insira o grau em Fahrenheit: ");

     f = scn.nextDouble();

     

     System.out.println("");

     c = (f-32)*5/9;

     System.out.print("A conversão deste grau em Celsius é: " + c);

     

   }

 }
