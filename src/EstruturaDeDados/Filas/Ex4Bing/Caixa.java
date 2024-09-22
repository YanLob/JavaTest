package EstruturaDeDados.Filas.Ex4Bing;

import java.util.LinkedList;
import java.util.Queue;

public class Caixa {

    Queue<String> filaCaixa = new LinkedList<>();

    public void adicionarClientes(String nome){
        filaCaixa.offer(nome);
    }

    public void atenderProximoCLiente() {

        System.out.println("Cliente " + filaCaixa.poll() + " Atendido. Proximo Cliente " + filaCaixa.peek());

        if (filaCaixa.isEmpty()) {
            System.out.println("Nao ha mais ninguem na fila.");
        }

    }
    

    public int quantidadeClientesNaFila(){
        return filaCaixa.size();
    }

}
