package EstruturaDeDados.HeapSort;

public class Main {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        // entendido
        System.out.println("Desordenado");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
            System.out.print(vetor[i] + " ");
        }

        /*
        o 'i' nao precisa passar pelo vetor inteiro para que o vetor seja
        totalmente percorrido, apenas com a metade do vetor - 1, a leitura dele inteiro [e bem sucedida.
        */
        // entendido
        int n = vetor.length;
        for(int i = (n / 2 - 1); i >= 0; i--){
            aplicarHeap( vetor, n , i);
        }

        // entendido
        System.out.print("// Quase ordenado ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        for (int i = n - 1; i > 0; i--){
            
            /* entendi
            *
            * o aux vai pra posicao do vetor[0] (comeco), o vetor[0] vai para a posicao do i que [e a ultima e o vetor[i]
            * vai para o aux que esta no comeco, trocando a posicao dos valores
            *
            * */
            int aux = vetor[0];
            vetor[0] = i;
            vetor[i] = aux;

            aplicarHeap(vetor, i ,0);

        }

        // entendido
        System.out.print("// Ordenado ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

    }

    private static void aplicarHeap(int[] vetor, int n, int i){

        // entendido
        int raiz = i;
        int esquerda = 2*i + 1;
        int direita = 2*i + 2;

        /* entendido */
        if(esquerda < n && vetor[esquerda] > vetor[raiz]){
            raiz = esquerda;
        }

        if(direita < n && vetor[direita] > vetor[raiz]){
            raiz = direita;
        }

        // A raiz anda primeiro que o i, se os dois tiverem em posicoes diferentes, quer dizer que o algoritimo esta andando
        // e quer dizer que deve ter os valores trocados

        if(raiz != i){
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;

            aplicarHeap(vetor, n, i);
        }

    }

    /*
    *
    *   blocos para entender 7
    *   Entendidos => 7
    *   Nao entendidos => 0
    *
    * */

}
