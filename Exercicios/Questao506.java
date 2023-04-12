/*Faça um algoritmo que escolha um número inteiros aleatório inteiro entre 1 e 60;*/

import java.util.*;
import java.util.Random;

public class Questao506{
    public static void main(String []args){
        Random aleatorio = new Random();
        
        int valor = aleatorio.nextInt(60)+1;
        System.out.print("O numero aleatório é "+valor);
    }
}
