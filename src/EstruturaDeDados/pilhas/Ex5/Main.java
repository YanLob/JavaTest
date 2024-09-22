package EstruturaDeDados.pilhas.Ex5;

public class Main {

    public static void main(String[] args) {

        Simbolos simbolos = new Simbolos();

        simbolos.imprimeResultado("A + B");
        simbolos.imprimeResultado("A + B + (C - D)");
        simbolos.imprimeResultado("{[()]}[](){()}");
        simbolos.imprimeResultado("{[(]}[](){()}");
        simbolos.imprimeResultado("A + B + C - D)");

    }
}
