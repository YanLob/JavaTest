package EstruturaDeDados.BuscaBinaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] vetor = new int[10000];

        for(int i = 0; i< vetor.length; i++){
            vetor[i] = i * 2;
        }

        System.out.print("Qual numero vc busca? ");
        Scanner sc = new Scanner(System.in);
        int buscado = sc.nextInt();

        int cont = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        while(inicio <= fim){
            meio = (int) ((inicio + fim) / 2);
            cont++;
            if(vetor[meio] == buscado){

                achou = true;
                break;
            }else if(vetor[meio] < buscado){

                inicio = meio + 1;
            }else{

                fim = meio - 1;
            }

        }

        if(achou){
            System.out.println("Achou");
        }else{
            System.out.println("Nao achou");
        }
        
        System.out.println("Quantidade de testes feitos: " + cont);


    }
}
