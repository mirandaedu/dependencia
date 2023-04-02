import java.util.*;

import java.util.Scanner;

 public class Questao101{

   public static void main(String args[]){

    double a, b, c;

    double mediari;

    Scanner scr = new Scanner(System.in);

    

    System.out.print("Insira uma nota: ");

    a = scr.nextDouble();

    

    System.out.print("Insira uma segunda nota: ");

    b = scr.nextDouble();

    

    System.out.print("Insira uma terceira nota: ");

    c = scr.nextDouble();

    

    System.out.println("");

    

    mediari = (a+b+c)/3;

    System.out.print("A média aritmética dessas notas é:"+mediari);

      

   }

 }
