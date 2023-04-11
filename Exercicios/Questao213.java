import java.util.*;

import java.util.Scanner;

public class Questao213{

   public static void main(String args[]){ 

    Scanner sc = new Scanner(System.in);

    double salario, nsalario;

    

    System.out.print("Informe o seu salário: ");

    salario = sc.nextDouble();

   

    if(salario<500){

      System.out.print("O seu salário agora é de "+(salario/15*100));

    }

    if(salario>=500 || salario==1000){

      System.out.print("O seu salario agora é de  "+(salario/5*100));

    }

   }

}
