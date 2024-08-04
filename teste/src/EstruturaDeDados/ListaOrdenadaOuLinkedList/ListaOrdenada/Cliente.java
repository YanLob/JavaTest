package EstruturaDeDados.ListaOrdenadaOuLinkedList.ListaOrdenada;

public class Cliente {
    private String nome;
    private int cpf;

    protected Cliente(String nome, int cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    protected int getCpf() {

        return cpf;
    }

    protected void setCpf(int cpf) {
        this.cpf = cpf;
    }

    protected String getNome() {

        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " | Cpf: " + getCpf();
    }
}
