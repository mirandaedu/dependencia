import java.util.*;
import java.util.Scanner;

public class Questao402{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        
        for(int i=0; i<5; i++){
        System.out.print("Insira um numero: ");
        vetorA[i] = sc.nextInt();
        }
        
        for(int i=0; i<5; i++){
            vetorB[i] = vetorA[i]*vetorA[i];
        } 
        
        for(int i=0; i<5; i++){
          System.out.println("O quadrado de "+vetorA[i]+" é "+vetorB[i]);
        }
    }
}
