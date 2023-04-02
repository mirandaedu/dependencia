import java.util.*;

import java.util.Scanner;

 class Questao104{

   public static void main(String args[]){

    double a, b, c, d;

    double mediap;

    Scanner scn = new Scanner(System.in);

    

    System.out.print("Entre com um valor para calcular a média ponderada: ");

    a = scn.nextDouble();

    System.out.print("Entre com um segundo valor: ");

    b = scn.nextDouble();

    System.out.print("Entre com um terceiro valor: ");

    c = scn.nextDouble();

    System.out.print("Entre com um quarto valor: ");

    d = scn.nextDouble();

    

    System.out.println("");

    mediap = (a*1+b*2+c*3+d*4)/(1+2+3+4);

    System.out.println("A media ponderada é: " + mediap);

    

   }

 }
