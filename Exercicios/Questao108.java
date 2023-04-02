import java.util.*;

import java.util.Scanner;

 public class Questao108{

   public static void main(String args[]){ 

    int a,b;

    int quadif, sub;

    Scanner scr = new Scanner(System.in);

   

    System.out.print("Insira um valor: ");

    a = scr.nextInt();

    System.out.print("Insira um segundo valor: ");

    b = scr.nextInt();

    

    System.out.println("");

    

    sub = a-b;

    quadif = sub*sub;

    System.out.print("O quadrado da diferença desses valores é: "+quadif);

    

   }

 }
