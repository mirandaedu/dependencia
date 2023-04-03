import java.util.Scanner;

public class Questao205{

  public static void main (String[] args){

      Scanner sc = new Scanner(System.in);

      double nota, rp, mediaF;

        

      System.out.print("Por favor, insira sua nota: ");

      nota = sc.nextDouble();

        

      if(nota>=6){

        System.out.print("O aluno está aprovado! ");

        return;

       }else{

         System.out.println("O aluno vai para a RP!");

        }

        

      System.out.print("\nInsira a nota tirada na RP: ");

      rp = sc.nextDouble();

        

      mediaF=(nota+rp)/2;

        

      if(mediaF>=5){

        System.out.println("Aluno aprovado na recuperação. ");

       }else{

         System.out.println("Reprovado."); 

        }     

  }

}
