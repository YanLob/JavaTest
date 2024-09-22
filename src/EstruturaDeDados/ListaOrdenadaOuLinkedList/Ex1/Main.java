package EstruturaDeDados.ListaOrdenadaOuLinkedList.Ex1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Pessoa> pessoas = new LinkedList<>();

        Pessoa pessoa1 = new Pessoa("Evandro", 19, 12931283);

        pessoas.add(pessoa1);

        if(pessoas.contains(new Pessoa("Evandro", 19, 12931283))){
            System.out.println("Essa pessoa ja existe na lista");
        }
        else{
            System.out.println("Esse pessoa nao existe na lista");
        }

        System.out.println(pessoas.size());
        System.out.println(pessoas.isEmpty());

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Teste");
        lista.add("Teste2");
        lista.add("Teste3");

        System.out.println(lista.get(lista.size()/2));

    }
}
