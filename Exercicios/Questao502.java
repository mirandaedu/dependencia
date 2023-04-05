import java.util.*;

import java.util.Scanner;

 public class Questao502{

   public static void main(String args[]){ 

     Scanner sc = new Scanner(System.in);

     int v1, v2, dif;

     

    System.out.print("Informe um valor: ");

    v1 = sc.nextInt();

    

    System.out.print("Informe outro valor: ");

    v2 = sc.nextInt();

    

    dif=v1-v2;

    System.out.print("\nO quadrado da diferença de "+v1+" e "+v2+" é "+Math.pow(dif,2));

   }

 }
