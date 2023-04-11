import java.util.*;
import java.util.Scanner;

public class Questao215{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.print("Insira o primeiro número: ");
        a=sc.nextInt();
        System.out.print("Insira o segundo número: ");
        b=sc.nextInt();
        
        if(a/b==1){
            System.out.print(a+" é multiplo de "+b+" e o resultado é "+(a*b));
        }else{
            System.out.print(a+" não é multiplo de "+b);
        }
    }
}
