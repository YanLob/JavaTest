package EstruturaDeDados.ListaOrdenadaOuLinkedList.ListaOrdenada;

public class ListaOrdenada<TIPO> {
    private Elemento<TIPO> primeiro;
    private Elemento<TIPO> ultimo;
    private int tamanho;

    public void adicionar(TIPO novoValor) {
        Elemento<TIPO> novoElemento = new Elemento<>(novoValor);

        if(this.primeiro == null && this.ultimo == null){

            this.primeiro = novoElemento;
            this.ultimo = novoElemento;


        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    public void remover(TIPO valor) {
        Elemento<TIPO> anterior = null;
        Elemento<TIPO> atual = this.primeiro;

        for(int i = 0; i < this.tamanho; i++){
            if(atual.getValor().equals(valor)){

                if(this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;

                } else if(atual == this.primeiro){

                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                } else if(atual == this.ultimo){

                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }
                else{

                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }

                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }

    }

    public Elemento<TIPO> get(int posicao) {
        Elemento<TIPO> atual = this.primeiro;

        for(int i = 0; i < posicao; i++) {
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }

        }

        return atual;
    }

    public int getTamanho() {
        return tamanho;
    }


    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Elemento<TIPO> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento<TIPO> ultimo) {
        this.ultimo = ultimo;
    }

    public Elemento<TIPO> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento<TIPO> primeiro) {
        this.primeiro = primeiro;
    }

    protected IteratorListaLigada<TIPO> getIterator(){
        return new IteratorListaLigada<TIPO>(this.primeiro);
    }

}
