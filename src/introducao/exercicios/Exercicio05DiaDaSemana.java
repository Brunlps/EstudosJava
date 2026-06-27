package src.introducao.exercicios;

import java.util.Scanner;

public class Exercicio05DiaDaSemana {
    static void main(String[] args) {
        byte dia = 7;

        Scanner dadoDia = new Scanner(System.in);
        System.out.println("Escolha um dia da semana de 1 à 7: ");
        byte diaEscolhinho = dadoDia.nextByte();

        switch (diaEscolhinho){
            case 1:
                System.out.println("Domingo");
            case 7:
                System.out.println("Sabádo");
                System.out.println("FDS!");
                break;

            case 2:
                System.out.println("Segunda-Feira");

            case 3:
                System.out.println("Terça-Feira");

            case 4:
                System.out.println("Quarta-feira");

            case 5:
                System.out.println("Quinta-Feira");

            case 6:
                System.out.println("Sexta-Feira");
                System.out.println("DIAS ÚTEIS");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
