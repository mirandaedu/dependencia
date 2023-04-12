/*13. Faça um algoritmo que escolha 6 números inteiros aleatórios diferentes entre 1 e 60. Ou seja, o algoritmo não pode apresentar números iguais.*/

import java.util.*;
import java.util.Random;

public class Questao513{
    public static void main(String []args){
        Random aleatorio = new Random();
        
        for(int i=0; i<6; i++){
            int valor = (int)(Math.random()*60)+1;
               System.out.println("O numero aleatório é "+valor);
        }
        
    }
}
