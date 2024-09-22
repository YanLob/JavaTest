package EstruturaDeDados.ListaOrdenadaOuLinkedList.ListaOrdenada;

public class main {
    public static void main(String[] args) {

        ListaOrdenada<String> lista = new ListaOrdenada<>();

        lista.adicionar("AC");
        lista.adicionar("PA");
        lista.adicionar("RO");
        lista.adicionar("AM");

        System.out.println("Primeiro => "+lista.getPrimeiro().getValor());
        System.out.println("Ultimo => "+lista.getUltimo().getValor());
        System.out.println("Tamanho => "+lista.getTamanho());

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }

        lista.remover("RO");
        System.out.println("Removendo RO da lista");
        lista.adicionar("SP");
        lista.remover("AC");
        lista.remover("PA");
        lista.remover("AM");
        lista.remover("SP");
        lista.adicionar("RJ");

        System.out.println("tamanho: " + lista.getTamanho());

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }




    }
}
