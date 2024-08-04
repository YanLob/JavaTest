package EstruturaDeDados.ListaOrdenadaOuLinkedList.ListaOrdenada;

import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {

        ListaOrdenada<Integer> lista = new ListaOrdenada<>();

        ArrayList<Integer> vetor = new ArrayList<>();

        int limite = 100000;

        // Tempo em Vetor

        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for (int i = 0; i < limite; i++){
            vetor.add(i);
        }


        tempoFinal = System.currentTimeMillis();

        System.out.println("Adicionou "+ limite +" elementos no vetor");
        System.out.println(tempoFinal - tempoInicial);

        // Tempo em Lista

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < limite; i++){
            lista.adicionar(i);
        }

        tempoFinal = System.currentTimeMillis();

        System.out.println("Adicionou "+ limite +" elementos no Lista");
        System.out.println(tempoFinal - tempoInicial);

        // Ler valores

        for (int i = 0; i < vetor.size(); i++){
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo de leitura do vetor");
        System.out.println(tempoFinal - tempoInicial);

        // Ler valores da lista usando iterator

        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();

        while(iterator.temProximo()){
            iterator.getProximo();
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo de leitura da Lista");
        System.out.println(tempoFinal - tempoInicial);

    }
}
