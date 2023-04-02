import java.util.*;

import java.util.Scanner;

 public class Questao114 {

   public static void main(String args[]){ 

    int t;

    double v, d, lu;

    Scanner scr = new Scanner(System.in);

    

    System.out.print("Informe o tempo gasto na viagem: ");

    t = scr.nextInt();

    System.out.print("Informe a velocidade durante a viagem: ");

    v = scr.nextInt();

    

    d = t*v;

    lu = d/12;

    

    System.out.println("O tempo gasto na viagem foi de: "+t);

    System.out.println("A velocidade media utilizada na viagem foi de: "+v);

    System.out.println("A distância percorrida da viagem foi de: "+d);

    System.out.println("A quantidade de listros utilizados foi de: "+lu);

   }

 }
