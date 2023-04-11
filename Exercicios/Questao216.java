/*16.Elabore um algoritmo que, dada a idade de um nadador, classifique-o em uma das seguintes categorias:
Infantil A: 5 - 7 anos Juvenil B: 14 - 17 anos
Infantil B: 8 - 10 anos Sênior: maiores de 18 anos
Juvenil A: 11 - 13 anos Inválida: menor que 5 maior 60*/

import java.util.*;
import java.util.Scanner;

public class Questao216{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int idade;
        
        System.out.print("Informe sua idade: ");
        idade = sc.nextInt();
        
        if(idade>=5 && idade<7){
            System.out.print("Infantil A");
        }if(idade>=8 && idade<10){
            System.out.print("Infantil B");
        }if(idade>=11 && idade<13){
            System.out.print("Juvenil A");
        }if(idade>=14 && idade<17){
            System.out.print("Juvenil B");
        }if(idade<60 && idade>=18){
            System.out.print("Sênior");
        }else{
            if(idade<5 || idade>60){
                System.out.print("Inválida");
            }
        }
    }
}
