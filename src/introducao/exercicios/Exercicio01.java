package src.introducao.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        int n1, n2, n3, n4, soma;

        Scanner numeroInteiroParaSoma;

        System.out.println("Digite o primeiro número: ");
        numeroInteiroParaSoma = new Scanner(System.in);
        n1 = numeroInteiroParaSoma.nextInt();

        System.out.println("Digite o segundo número: ");
        numeroInteiroParaSoma = new Scanner(System.in);
        n2 = numeroInteiroParaSoma.nextInt();

        System.out.println("Digite o terceiro número: ");
        numeroInteiroParaSoma = new Scanner(System.in);
        n3 = numeroInteiroParaSoma.nextInt();

        System.out.println("Digite o quarto número: ");
        numeroInteiroParaSoma = new Scanner(System.in);
        n4 = numeroInteiroParaSoma.nextInt();

        soma = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A soma é: " + soma);
    }
}
