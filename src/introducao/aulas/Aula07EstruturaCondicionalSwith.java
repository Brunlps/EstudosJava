package src.introducao.aulas;

import java.util.Scanner;

public class Aula07EstruturaCondicionalSwith {
    static void main(String[] args) {
        byte dia = 7;
        int diaEscolhido;

        Scanner dadoDia = new Scanner(System.in);
        System.out.println("Escolha o dia da semana de 1 a 7: ");
        diaEscolhido = dadoDia.nextByte();

// SE NÃO COLOCAR O BREAK, O SWITCH VAI PASSAR POR TODOS OS CASE!

        switch (diaEscolhido){
            case (1):
                System.out.println("Domingo!");
                break;
            case (2):
                System.out.println("Segunda!");
                break;
            case (3):
                System.out.println("Terça!");
                break;
            case (4):
                System.out.println("Quarta!");
                break;
            case (5):
                System.out.println("Quinta!");
                break;
            case (6):
                System.out.println("Sexta!");
                break;
            case (7):
                System.out.println("Sabádo!");
                break;
            default:
                System.out.println("Opção inválida!");

        }

        char sexo = 'M';
        switch (sexo){
            case 'F':
                System.out.println("Masculino");
                break;
            case 'M':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
