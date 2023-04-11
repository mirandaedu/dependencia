import java.util.*;
import java.util.Scanner;

public class Questao503{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int v;
        
        System.out.print("Insira um valor: ");
        v = sc.nextInt();
        
        System.out.print("A raiz quadrada deste valor é de "+Math.sqrt(v));
    }
}
