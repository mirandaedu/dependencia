import java.util.*;
import java.util.Scanner;

public class Questao217{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int codigo;
        
        System.out.print("Informe seu nome: ");
        String nome = sc.next();
        System.out.print("Informe o seu código: ");
        codigo = sc.nextInt();
        
        if(codigo==1){
            System.out.print("Menor de 18 anos");
        }if(codigo==2){
            System.out.print("De 18 até 20 anos");
        }if(codigo==3){
            System.out.print("De 21 até 25 anos");
        }if(codigo==4){
            System.out.print("De 26 até 29 anos");
        }if(codigo==5 || codigo==6){
            System.out.print("De 30 até 35 anos");
        }if(codigo>=7 && codigo<=9){
            System.out.print("De 36 até 50 anos");
        }if(codigo==10){
            System.out.print("Acima de 50 anos");
        }else{
            if(codigo>10 || codigo==0)
            System.out.print("Código Inválido");
        }
    }
}
