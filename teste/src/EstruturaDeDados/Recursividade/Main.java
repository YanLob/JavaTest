package EstruturaDeDados.Recursividade;

public class Main {

     public static void main(String[] args) {
        int[] vetor = new int[5];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }


        System.out.println(somar(0, 0, vetor));
     }

    public static int somar(int soma, int posicao, int[] vetor){

        if(posicao < vetor.length){
            //Somando elemento da posicao
            soma += vetor[posicao];
            // Recursividade [e fazer o metodo chamar ele mesmo
            return somar(soma , posicao+1, vetor);
        }

        return soma;
    }

}
