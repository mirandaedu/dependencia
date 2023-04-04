import java.util.*;

import java.util.Scanner;

public class Questao309{

  public static void main(String args[]){ 

    Scanner sc = new Scanner(System.in);

    int n;

    int i=0;

    

    System.out.print("Informe um valor para a tabuada: ");

    n = sc.nextInt();

    

    while(i<=9){

      i++;

      System.out.println(n+" x "+i+" = "+(n*i));

    }

  }

}
