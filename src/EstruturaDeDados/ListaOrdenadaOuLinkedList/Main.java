package EstruturaDeDados.ListaOrdenadaOuLinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        LinkedList<String> nomes = new LinkedList<>();

        nomes.add("Evandro");
        nomes.add("João");
        //nomes.add("Luana");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("José");

        nomes.add(2, "Luana");
        System.out.println(nomes);

        System.out.println();

        LinkedList<String> novosNomes = new LinkedList<>();
        novosNomes.add("Ana");
        novosNomes.add("Biara");
        novosNomes.add("Biara");

        nomes.addAll(2, novosNomes);
        System.out.println(nomes);

        //nomes.clear();
        System.out.println(nomes.contains("Ana"));

        System.out.println(nomes.get(3));
        System.out.println();

        for(int i=0; i<nomes.size();i++){
            System.out.println(nomes.get(i));
        }

        System.out.println(nomes.lastIndexOf("Biara"));

        nomes.set(2, "Arthur");
        System.out.println(nomes.contains("Evandro"));


        //String[] num = {"A", "B", "C", "D", "E"};

        //System.out.println(num.length);
        
    }
}
