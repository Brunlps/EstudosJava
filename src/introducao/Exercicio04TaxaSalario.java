package src.introducao;

public class Exercicio04TaxaSalario {
    static void main(String[] args) {
        double salarioAtual = 70000;

        double primeiraFaixa = 9.0 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAtual <= 3712 ) {
            valorImposto = salarioAtual * primeiraFaixa;
            System.out.println("Taxa a ser paga do imposto abaixo do salario " + valorImposto);

        }else if (salarioAtual > 3713 && salarioAtual < 68507) {
            valorImposto = salarioAtual * segundaFaixa;
            System.out.println("Taxa a ser paga do imposto acima mas abaxo do teto do salario " + valorImposto);

        }else {
            valorImposto = salarioAtual * terceiraFaixa;
            System.out.println("Taxa a ser paga do imposto acima teto do salario " + valorImposto);

        }
    }
}
