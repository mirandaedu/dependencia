import java.util.*;

import java.util.Scanner;

public class Questao109{

   public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);

     double salario;

     double aumento;

     double totalVendas;

    

     System.out.println("O salario do funcionario é: ");

     

     salario = scanner.nextInt();

     aumento = salario*0.15; 

     totalVendas = salario+aumento;

     

     System.out.println("O salario final é:"+totalVendas);

     }

 }
