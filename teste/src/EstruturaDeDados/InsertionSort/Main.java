package EstruturaDeDados.InsertionSort;

public class Main {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        int ext;
        for(int i = 1; i < vetor.length; i++){
            ext = vetor[i];
            int j = i - 1;

            while(j >= 0 && vetor[j] > ext){

                vetor[j + 1] = vetor[j];
                j--;

            }
            
            vetor[j + 1] = ext;

        }

        System.out.println("Vetor organizado");

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

    }
}
