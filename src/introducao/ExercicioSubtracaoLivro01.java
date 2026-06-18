package src.introducao;

import java.util.Scanner;

public class ExercicioSubtracaoLivro01 {
    static void main(String[] args) {
        Scanner numerosParaSubtrair = new Scanner(System.in);

        double primeiroNumero, segundoNumero, subtraindoDoisNumeros;

        System.out.println("=================== Calculadora ===================");

        System.out.println("Digite o primeiro número para calcular:");
        primeiroNumero = numerosParaSubtrair.nextDouble();

        System.out.println("Digite o segundo número para calcular:");
        segundoNumero = numerosParaSubtrair.nextDouble();

        subtraindoDoisNumeros = primeiroNumero - segundoNumero;

        System.out.println("Resultado da subtração: " + subtraindoDoisNumeros);

        System.out.println("=================== FIM ===================");
    }
}
