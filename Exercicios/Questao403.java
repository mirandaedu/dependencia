import java.util.*;
import java.util.Scanner;

public class Questao403{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double nota[] = new double[10];
        double media;
        
        for(int i=0; i<10; i++){
            System.out.print("%d°Informe a nota do aluno"+(i+1));
            nota[i] = sc.nextDouble();
        }
        
        for(int i=0; i<10; i++){
            media =+ nota[i]/10;
             if(media>=6){
                System.out.print("O numero de alunos aprovados é de "+nota[i]);
             }
        }
    }
}
