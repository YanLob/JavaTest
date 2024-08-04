package EstruturaDeDados.Filas.Ex3Refactor;


public class Pessoa {

    private int nome;
    private int codigo;

    public Pessoa(int nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Pessoa{ nome='" + getNome() + "', codigo=" + getCodigo() + " }";
    }

}
