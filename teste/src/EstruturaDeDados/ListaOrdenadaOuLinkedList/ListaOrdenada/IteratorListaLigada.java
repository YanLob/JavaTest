package EstruturaDeDados.ListaOrdenadaOuLinkedList.ListaOrdenada;

public class IteratorListaLigada<TIPO> {

    private Elemento<TIPO> elemento;

    public IteratorListaLigada(Elemento<TIPO> atual){
        this.elemento = atual;
    }

    protected boolean temProximo(){
        if(elemento.getProximo() == null){
            return false;
        }else{
            return true;
        }
    }

    protected Elemento<TIPO> getProximo(){
        elemento = elemento.getProximo();

        return elemento;
    }


}
