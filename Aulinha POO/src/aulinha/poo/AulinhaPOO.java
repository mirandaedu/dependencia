package aulinha.poo;

public class AulinhaPOO {
    public static void main(String[] args) {
        
        Ponto p1 = new Ponto();
        int xP1 = p1.getX();
        int yP1 = p1.getY();
        System.out.println("X: "+xP1);
        System.out.println("Y: "+yP1);
  
        p1.setPosicao(10, 5);
        xP1 = p1.getX();
        yP1 = p1.getY();
        System.out.println("X: "+xP1);
        System.out.println("Y: "+yP1);

    }   
}