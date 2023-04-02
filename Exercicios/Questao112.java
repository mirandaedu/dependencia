import java.util.*;

import java.util.Scanner;

 public class Questao112{

   public static void main(String args[]){

     double a, volume, pi, r;

     pi = 3.1416;

     Scanner scr = new Scanner(System.in);

     

     System.out.print("Insira um valor para o raio: ");

     r = scr.nextDouble();

     System.out.print("Insira um valor para a altura: ");

     a = scr.nextDouble();

     

     System.out.println("");

     

     volume = pi*(r*r)*a;

     System.out.print("O volume da lata de óleo é de: "+ volume);

   }

 }
