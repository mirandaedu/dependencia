import java.util.*;

import java.util.Scanner;

 public class Questao105{

   public static void main(String args[]){ 

     double c;

     double f;

     Scanner scn = new Scanner(System.in);

    

     System.out.print("Insira o grau em Celsius: ");

     c = scn.nextDouble();

     

      System.out.println("");

     

     f = (9*c+160)/5;

     System.out.print("A conversão deste grau em Fahrenheit é: " + f);

     

   }

 }
