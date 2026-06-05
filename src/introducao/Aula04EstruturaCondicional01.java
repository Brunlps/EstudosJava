package src.introducao;

public class Aula04EstruturaCondicional01 {
    static void main() {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado para compra bebida");
        }else{
            System.out.println("Não autorizado para compra bebida");
        }

        if(isAutorizadoComprarBebida){
            System.out.println("Não autorizado para compra bebida");
        }

        System.out.println("Fora do if");
    }
}
