

import java.util.*;

import java.util.Scanner;

public class Questao203{

   public static void main(String args[]){ 

     Scanner sc = new Scanner(System.in);

     int sexo, idade;

 

     System.out.println("Informe seu sexo: \n1 para Mulher e 2 para Homem");

     sexo = sc.nextInt();

     

     System.out.println("Agora, Informe sua idade: ");

     idade = sc.nextInt();

     

     if(sexo==1 && idade>=60){

       System.out.print("\nVocê é mulher e pode se aposentar ");

     }if(idade<60){

         System.out.print("\nVocê não tem idade suficiente para se aposentar");

        }

       else{

       if(sexo==2 && idade>=65){

         System.out.print("\nVocê é homem e pode se aposentar ");

        }if(idade<65){

         System.out.print("\nVocê não tem idade suficiente para se aposentar");

         }

       }

  }  

}
