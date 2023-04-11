/*Faça um algoritmo que escolha, de forma aleatória, um número
qualquer entre 1 e 10*/
import java.util.Random;

public class Questao505{
    public static void main(String [] args){
        Random aleatorio = new Random();
        
        int valor = aleatorio.nextInt(10)+1;
        System.out.print("Número gerado é: "+valor);
    }
}
