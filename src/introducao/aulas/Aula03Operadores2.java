package src.introducao.aulas;

public class Aula03Operadores2 {
    static void main() {
        /* =========== TABELA VERDADE ===========

         *  (AND) -> &&          (OR) -> ||
         *  V && V = V           V || V = V
         *  V && F = F           F || V = V
         *  F && V = F           V || F = V
         *  F && F = F           F || F = F
         *TODAS DEVEM SER        PELO MENOS 1 DEVE SER VERDADEIRA
         *VERDADEIRAS!
         * */

    // &&  (AND) - As duas condições deve ser verdadeiras
        int idade = 30;
        float salario = 3567;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 3567;
        System.out.println("Esta Dentro da lei?: " + isDentroDaLeiMaiorQueTrinta);

        boolean isDentroDaLeiMenoQueTrinta = idade < 30 && salario >= 3612;
        System.out.println("Esta Dentro da lei? " + isDentroDaLeiMenoQueTrinta);



    //  || (OR) - Pelo menos
        double valorTotalContaCorrente = 2000;
        double valorTotalContaPoupanca = 10000;
        float valorDoPlaystation = 10000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorDoPlaystation || valorTotalContaPoupanca >= valorDoPlaystation;
        System.out.println("Da pra comprar os Playstation? "+ isPlaystationCincoCompravel);

    // = , +=, -=, /=, %=
        double bonus = 1800;
        System.out.println(bonus);


        bonus += 100;
        System.out.println(bonus);

        bonus *= 18;
        System.out.println(bonus);

        bonus /= 10;
        System.out.println(bonus);
    // Incremento ++, Decremento -- |-> Adiciona ou subtrai 1
        int contador = 0;
        contador += 1;
//        System.out.println(contador);

        contador++;
        System.out.println(contador);

        contador--;
        System.out.println(contador);

    // ++antes, --antes
        int contador2 = 0;
//        ++contador2;
        System.out.println(++contador2);

//        --contador2;
        System.out.println(--contador2);
    }
}
