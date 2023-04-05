import java.util.*;

import java.util.Scanner;

public class Dcoder{

  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    double v, resul;

    

    System.out.print("Informe um valor: ");

    v = sc.nextDouble();

    

    resul = Math.abs(v);

    

    System.out.print("\nO valor absoluto de "+v+" é igual a "+resul);

    

  }

}
