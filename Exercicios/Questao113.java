import java.util.*;

import java.util.Scanner;

 class Questao113{

   public static void main(String args[]){ 

    int raio;

    double pi, peri, area;

    pi = 3.1416;

    Scanner scr = new Scanner(System.in);

    

    System.out.print("Informe um número para calcular o raio e a área : ");

    raio = scr.nextInt();

    

    peri = 2*pi*raio;

    area = pi*(raio*raio);

    

    System.out.println("O perímetro deste raio é de: "+peri);

    System.out.println("A area deste raio é de: "+area);

    

   }

 }
