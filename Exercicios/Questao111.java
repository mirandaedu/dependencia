import java.util.*;

import java.util.Scanner;

 public class Questao111{

   public static void main(String args[]){ 

     double valor, tempo, taxa, prest;

     Scanner scr = new Scanner(System.in);

     

     System.out.print("Informe a valor da prestação: ");

     valor = scr.nextDouble(); 

     System.out.print("Agora, informe o tempo de atraso desta prestação: ");

     tempo = scr.nextDouble();

     System.out.print("Informe também a taxa a ser paga pelo atraso: ");

     taxa = scr.nextDouble();

     

     prest = valor+(valor*(taxa/100)*tempo);

     

    System.out.println("A prestação a ser paga para esta fatuta em atraso será de "+prest);

   }

 }

