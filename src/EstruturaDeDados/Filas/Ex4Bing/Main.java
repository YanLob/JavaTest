package EstruturaDeDados.Filas.Ex4Bing;
public class Main {

    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        Caixa caixa2 = new Caixa();

        caixa.adicionarClientes("Evandro");
        caixa.adicionarClientes("Pedro");
        caixa.adicionarClientes("Jao");
        caixa.adicionarClientes("Arthur");
        caixa2.adicionarClientes("Biara");
        caixa2.adicionarClientes("Luana");
        caixa2.adicionarClientes("Igor");

        System.out.println(caixa.quantidadeClientesNaFila());


        System.out.println("CAIXA 1");
        caixa.atenderProximoCLiente();
        caixa.atenderProximoCLiente();
        System.out.println("CAIXA 2");
        caixa2.atenderProximoCLiente();
        caixa2.atenderProximoCLiente();

    }
}
