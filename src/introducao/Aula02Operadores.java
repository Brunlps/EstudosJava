package src.introducao;

import java.util.Scanner;

public class Aula02Operadores {
    static void main() {
    //   Trabalhando com operadores Aritméticos
//        int num1, num2, soma;
//        Scanner dadoCalculo;
//
//        System.out.println("Digite o primeiro numero: ");
//        dadoCalculo = new Scanner(System.in);
//        num1 = dadoCalculo.nextInt();
//
//        System.out.println("Digite o primeiro numero: ");
//        dadoCalculo = new Scanner(System.in);
//        num2 = dadoCalculo.nextInt();
//
//        soma = num1 + num2;
//        System.out.println("A soma de "+num1+" + "+num2+" é "+soma);

    //  Trabalhando com Operadores Relacionais
    //  Resto %
//        int resto = 28 % 3;
//        System.out.println("O resto é "+resto);

    // Comparação: < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 < 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);

        boolean isDezIgualVinte = 10 == 10.10;
        System.out.println("isDezMenoQueVinte " + isDezIgualVinte);

        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMenoQueVinte " + isDezDiferenteQueVinte);


    }


}
