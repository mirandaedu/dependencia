import java.util.*;

import java.util.Scanner;

public class Questao204{

   public static void main(String args[]){ 

     Scanner scr = new Scanner(System.in);

     double n1, n2, media;

     

    System.out.print("Insira a primeira nota do aluno: ");

    n1 = scr.nextDouble();

    System.out.print("Insira a segunda nota do aluno: ");

    n2 = scr.nextDouble();

    

    media=(n1+n2)/2;

    

    if(media>=7){

      System.out.println("\nAprovado por média!");

    }else{

      if(media<7){

        System.out.println("\nNão aprovado por média!");

      }

   }

 }

} 
