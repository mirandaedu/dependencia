import java.util.*;

import java.util.Scanner;

public class Questao115{

    public static void main(String[]args){

        int N, horas, minutos, segundos;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe os segundos de duração do evento: ");

        N = scanner.nextInt();

        

        horas = N / 3600;

        minutos = (N % 3600) / 60;

        segundos = (N % 3600) % 60;

        System.out.println("O evento durou exatamente "+horas + ":" + minutos + ":" + segundos);

    }

}
