package EstruturaDeDados.BuscaLinear;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[8];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }

        System.out.print("Qual valor vc quer encontrar? ");
        int resp = sc.nextInt();

        boolean achou = false;
        for(int i = 0; i < vetor.length; i++){
            if(resp == vetor[i]){

                achou = true;
                break;
            }

        }

        if(achou){
            System.out.println("Achou");
        }else{
            System.out.println("Nao achou");
        }

    }
}
