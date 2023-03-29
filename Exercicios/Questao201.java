package Exercicios;

import java.util.*;
import java.util.Scanner;

public class Questao201 {
    public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     int i;
     
     System.out.println("Informe a sua idade: ");
     i = scr.nextInt();
     
     if (i>=18){
         System.out.println("Você é maior de idade!");
     } else{
         System.out.println("Você é menor de idade!");
     }   
    }
}
