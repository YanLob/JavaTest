package EstruturaDeDados.ListaOrdenadaOuLinkedList.ListaOrdenada;

public class TesteInteiros {
    public static void main(String[] args) {
        ListaOrdenada<Integer> inteiros = new ListaOrdenada<>();

        inteiros.adicionar(1);
        inteiros.adicionar(2);
        inteiros.adicionar(3);

        System.out.println("Tamanho: " + inteiros.getTamanho());
        for(int i = 0; i < inteiros.getTamanho(); i++){
            System.out.println(inteiros.get(i).getValor());
        }


    }
}
