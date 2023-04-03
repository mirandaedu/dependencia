import java.util.*;

import java.util.Scanner;

public class Questao208{

   public static void main(String args[]){

     Scanner sc = new Scanner(System.in);

     int a, b;

     

    System.out.print("Insira o primeiro numero: ");

    a = sc.nextInt();

    

    System.out.print("Insira o segundo numero: ");

    b = sc.nextInt();

    

    if(a==b){

      System.out.print("\nOs números informados são iguais! ");

    }else{

      if(a<b){

        System.out.print(a+"\n"+b);

      }

      if(b<a){

        System.out.print(b+"\n"+a);

      }

   }

  }

}
