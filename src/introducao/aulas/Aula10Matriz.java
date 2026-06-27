package src.introducao.aulas;

public class Aula10Matriz {
    static void main(String[] args) {

        byte[] array = new byte[5];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        for (byte i = 0; i < array.length; i++) {
            System.out.println("Array: " + array[i]);
        }
    }
}
