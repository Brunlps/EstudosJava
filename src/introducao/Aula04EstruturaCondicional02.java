package src.introducao;

public class Aula04EstruturaCondicional02 {
    static void main() {
        // idade < 15 -> categoria infantil
        // idade >= 15 && idade < 18 -> categoria juvenil
        // idade >= 18 -> categoria adulto

        int idade = 16;
        String categoria;

        if (idade < 15){
            categoria = "Categoria infantil.";
        } else if (idade > 15 && idade < 18) {
            categoria = "Categoria Juveníl";
        }else {
            categoria = "Categoria Adulto.";
        }

        System.out.println(categoria);
    }
}
