package src.introducao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        * Esse código teve um erro na hora de receber os dados
        * 1 - Ao digitar os números com ponto fluante, digite no lugar do (.) uma (,)
        * 2 - Também posso fazer a mudança para receber pontos(.)
        * Para isso devo usar usar um método que faz o Scanner recebar um pono fluante,
        * Porque sempre O Scanner vai esperar uma virgula por causa da linguagem PT_BR*/

        double nota1, nota2, nota3, resultadoMedia;

        Scanner dadosMedias;

        System.out.println("Digite a nota 1: ");

        dadosMedias = new Scanner(System.in).useLocale(Locale.US);
        nota1 = dadosMedias.nextDouble();

        System.out.println("Digite a nota 2: ");
        dadosMedias = new Scanner(System.in);
        nota2 = dadosMedias.nextDouble();

        System.out.println("Digite a nota 3: ");
        dadosMedias = new Scanner(System.in);
        nota3 = dadosMedias.nextDouble();

        resultadoMedia = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("Média do aluno é: " + resultadoMedia);
    }
}
