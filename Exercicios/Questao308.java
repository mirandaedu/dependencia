*Elaborar um programa que apresente no final o somatório dos 

valores pares existente na faixa de 1 até 500.*/

  

import java.util.*;

public class Questao308{

  public static void main(String args[]){ 

    int i;

    int soma=0;

    

    for(i=1; i<=500; i++){

      if(i%2==0){

        soma=soma+i;

      }

    }

   System.out.println("A soma dos números pares de 1 a 500 é igual a "+soma);

  }

}
