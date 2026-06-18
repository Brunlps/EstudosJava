package src.introducao;

public class Exercicio07ValorDeParcelasDoCarro {
    static void main(String[] args) {
//        Pelo valor do carro tenho que saber
//        quantas parcelas o cliente deve pagar

        double valorDoCarro = 40000;

        for(int parcela = 1; parcela <= valorDoCarro; parcela++) {

            double valorParcela = valorDoCarro / parcela;

//            System.out.println(valorParcela);

            if (valorParcela < 1000) {
                continue;

            }
            System.out.println("Parcela: " + parcela + "\nValor: " + valorParcela);

//            System.out.println(parcela);


        }
    }
}
