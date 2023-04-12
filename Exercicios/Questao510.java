/*Faça um algoritmo que leia uma palavra e reconstrua essa palavra de traz para frente. Exemplo: “AMOR” passa para “ROMA”.*/

public class Questao510{
    public static void main(String[] args) {
      String a = "AMOR";
        String reverso = "";
        for(int b=a.length()-1; b>=0;b--){
            reverso += String.valueOf(a.charAt(b));
         }
        System.out.println(reverso);
    }
}
