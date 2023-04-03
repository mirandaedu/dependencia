import java.util.*;

import java.util.Scanner;

 class Questao207 {

   public static void main(String args[]){ 

     Scanner sc = new Scanner(System.in);

     double h, pIdealM, pIdealF;

     int sexo;

     

    System.out.print("Informe quanto de altura você tem: ");

    h = sc.nextDouble();

    

    System.out.print("Informe o seu sexo (1 para M e 2 para F): ");

    sexo = sc.nextInt();

    

    pIdealM= (72.7*h)-58;

    pIdealF= (62.1*h)-44.7;

    

    if(sexo==1){

      System.out.println("O seu peso ideal é de "+pIdealM);

    }

    if(sexo==2){

      System.out.println("O seu peso ideal é de "+pIdealF);

    }

   }

}
