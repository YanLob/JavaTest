package EstruturaDeDados.Filas.Ex2;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Atendimento atendente = new Atendimento();

        Queue<String> regular = new LinkedList<>();
        Queue<String> prioridade = new LinkedList<>();

        regular.offer("Pessoa 1");
        regular.offer("Pessoa 2");
        regular.offer("Pessoa 3");

        prioridade.offer("Pessoa 1P");
        prioridade.offer("Pessoa 2P");
        prioridade.offer("Pessoa 3P");
        prioridade.offer("Pessoa 4P");
        prioridade.offer("Pessoa 5P");

        regular.offer("Pessoa 4");
        regular.offer("Pessoa 5");
        regular.offer("Pessoa 6");
        regular.offer("Pessoa 7");
        regular.offer("Pessoa 8");


        final int MAX_PRIORIDADE = 3;

        while (!regular.isEmpty() || !prioridade.isEmpty()) {

            int cont = 0;

            while (!prioridade.isEmpty() && cont < MAX_PRIORIDADE) {
                atendente.atendendoFilas(prioridade);

                cont++;
            }

            if(!regular.isEmpty()){

                atendente.atendendoFilas(regular);
            }

        }


    }
}
