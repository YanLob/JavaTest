package EstruturaDeDados.ListaOrdenadaOuLinkedList.ListaOrdenada;

public class TesteCliente {
    public static void main(String[] args) {

        ListaOrdenada<Cliente> clientes = new ListaOrdenada<>();

        clientes.adicionar(new Cliente("Nill", 1112223330));
        clientes.adicionar(new Cliente("Silvio", 1921123483));
        clientes.adicionar(new Cliente("Lucas", 574843612));

        for(int i = 0; i < clientes.getTamanho(); i++){
            System.out.println(clientes.get(i).getValor().toString());
        }

    }
}
