package EstruturaDeDados.Filas.Ex3Refactor;

import java.util.*;

public class Main {

    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {


        Atendimento atendente = new Atendimento();

        Queue<Pessoa> fila = new PriorityQueue<>(Comparator.comparingInt(Pessoa::getCodigo));
        //Queue<Pessoa> fila = new LinkedList<>();

        Random rand = new Random();

        //final int MAX_VALUE = 3;

        // codigo 0 == VERMELHO
        // codigo 1 == AMARELO
        // codigo 2 == VERDE

        fila.offer(new Pessoa(1, VERMELHO));
        fila.offer(new Pessoa(2, VERDE));
        fila.offer(new Pessoa(3, AMARELO));
        fila.offer(new Pessoa(4, VERMELHO));
        fila.offer(new Pessoa(5, AMARELO));
        fila.offer(new Pessoa(6, VERDE));

        //Queue<Pessoa> novosPacientes = new PriorityQueue<>(Comparator.comparingInt(Pessoa::getCodigo));

        while (!fila.isEmpty()) {

            Pessoa pessoa = fila.poll();


            try {
                Thread.sleep(1000);
                atendente.atendimento(pessoa);
            } catch (InterruptedException e) {
                System.err.println("Erro ao suspender a thread: " + e.getMessage());
            }

            //if(novosPacientes.isEmpty()){

            //    try {
            //        Thread.sleep(4000);
            //        novosPacientes.offer(new Pessoa(7, rand.nextInt(0,2)));
            //        System.out.println("CHEGOU UM PACIENTE. nome "+ novosPacientes.poll().getCodigo());
            //    }catch (InterruptedException e) {
            //        e.printStackTrace();
            //    }

            //}


        }
        //System.out.println(novosPacientes);
        System.out.println(fila);

    }
}
