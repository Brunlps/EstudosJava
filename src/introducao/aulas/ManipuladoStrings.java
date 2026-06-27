package src.introducao.aulas;

public class ManipuladoStrings {
    static void main(String[] args) {
        String nome = "Bruna";
        String segundoNome;
//        String sobrenome = "Lopes";

        System.out.println(nome);
        System.out.println(nome.substring(1,4)); // -> pegou de 1 a 3

        segundoNome = nome.replace("Bruna", "Kércia");
        System.out.println(segundoNome);

        String fraseMtivacional = "A vida é mais do que só esperar milagres, é ação, é fazer o próprio milagre acontecer dentro de nós.";
        System.out.println(fraseMtivacional);
        System.out.println(fraseMtivacional.length()); // -> 100 caracteres + espaços
    }
}
