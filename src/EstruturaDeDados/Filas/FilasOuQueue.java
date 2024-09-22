package EstruturaDeDados.Filas;

import java.util.LinkedList;
import java.util.Queue;

public class FilasOuQueue {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();

        fila.offer("1");
        fila.offer("2");
        fila.offer("3");

        System.out.println("Fila: " + fila);

        String primeiroElemento = fila.poll();
        System.out.println("Removido da fila: " + primeiroElemento);

        System.out.println("Fila após remoção: " + fila);

        System.out.println();

        System.out.println("Adicionando fila: " + fila.offer("4"));

        System.out.println("Fila apos adicao " + fila);

    }

}
