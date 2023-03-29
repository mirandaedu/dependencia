package Exercicios;

import java.util.*;

public class Questao304 {
    public static void main(String [] args){
     int x, soma;
     soma =0;
     x = 1;
     while (x<=100){
        System.out.println(x);
            soma += x;
            x++;
        }
     
     System.out.println("A soma dos numeros de 1 a 100 é "+soma);
    }
}
