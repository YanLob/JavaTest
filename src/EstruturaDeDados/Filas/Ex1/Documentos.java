package EstruturaDeDados.Filas.Ex1;

public class Documentos {

    public String nome;
    public int qntFolhas;

    public Documentos(String nome, int qntFolhas) {
        this.nome = nome;
        this.qntFolhas = qntFolhas;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntFolhas() {

        return qntFolhas;
    }

    public void setQntFolhas(int qntFolhas) {
        this.qntFolhas = qntFolhas;
    }



}
