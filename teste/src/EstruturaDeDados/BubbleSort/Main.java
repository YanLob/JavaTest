package EstruturaDeDados.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        //long inicio = System.currentTimeMillis();
        //long fim;

        int ext;
        for(int i = 0; i < vetor.length; i++){

            for(int j = i+1; j < vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    ext = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = ext;
                }
            }

        }
        //fim = System.currentTimeMillis();
        //System.out.println("Tempo: " + (fim - inicio));

        System.out.println("imprimindo vetor ordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

    }
}
