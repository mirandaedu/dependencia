package Exercicios;

import java.util.Scanner;

public class Questao202 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int a, b;
       
       System.out.println("Informe o primeiro valor:");
       a = scanner.nextInt();
       
       System.out.println("Informe o segundo valor:");
       b = scanner.nextInt();
       
       if(a<b){
           System.out.println(a+" é o menor numero");
       }else{
           if(b<a){
           System.out.println(b+" é o menor numero");
           }
       }    
    }
}