package poo;


import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();
        int y = teclado.nextInt();

        Aritmetica p = new Aritmetica();
        int soma = p.soma(x,y);
        System.out.println("Soma: " + soma);

        int sub = p.sub(x,y);
        System.out.println("Subtração: " + sub);

        int mult = p.mult(x,y);
        System.out.println("Multiplicação: " + mult);

        float div = p.div(x,y);
        System.out.println("Divisão: " + div);
    }

}
