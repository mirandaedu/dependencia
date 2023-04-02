import java.util.*;

import java.util.Scanner;

 public class Questao103{

   public static void main(String args[]){ 

    double a,b,c;

    double mp;

    Scanner scr = new Scanner(System.in);

    

    System.out.print("Insira um valor para o cálculo: ");

    a = scr.nextDouble();

    System.out.print("Insira um segundo valor: ");

    b = scr.nextDouble();

    System.out.print("Insira um terceiro valor: ");

    c = scr.nextDouble();

    

    System.out.println("");

    

    mp = (a*1+b*2+c*3)/5;

    System.out.print("A media ponderada dessas notas é: "+mp);

   }

 }

