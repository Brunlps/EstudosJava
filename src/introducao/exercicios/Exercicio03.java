package src.introducao.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main() {
        /*
        * Conversor de Moedas:
        Peça um valor em reais e mostre quanto seria em dólares
        (usando uma constante final para a cotação).
        */
        double moedaReais, moedaDolar;
        final double cotacao = 5.07;
        Scanner dadosMoedas;

        System.out.println("Conversor de moeda: R$");
        dadosMoedas = new Scanner(System.in);
        moedaReais = dadosMoedas.nextDouble();

        moedaDolar = moedaReais / cotacao;
        System.out.print("Valor em dolar: $" + moedaDolar);
    }
}
