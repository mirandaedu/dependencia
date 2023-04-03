import java.util.*;

import java.util.Scanner;

public class Questao206{

  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int a, b, c;

    

    System.out.print("Informe o primeiro valor: ");

    a = sc.nextInt();

    System.out.print("Informe o segundo valor: ");

    b = sc.nextInt();

    System.out.print("Informe o terceiro valor: ");

    c = sc.nextInt();

    

    if(a>b && a>c){

      System.out.print(a+" é maior que "+b+ " e "+c);

    }else{

      if(b>a && b>c){

      System.out.print(b+" é maior que "+a+ " e "+c);

    }

    }

    if(c>a && c>b){

      System.out.print(c+" é maior que "+b+ " e "+a);

    }

  }

}
