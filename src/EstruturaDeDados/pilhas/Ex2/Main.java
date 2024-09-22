package EstruturaDeDados.pilhas.Ex2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stackPar = new Stack();
        Stack stackImpar = new Stack();

        Scanner sc = new Scanner(System.in);
        int valor;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "o valor: ");
            valor = sc.nextInt();

            if(valor == 0){

                if(!stackPar.isEmpty() && !stackImpar.isEmpty()){
                    System.out.println("Desempilhando da pilha PAR o valor => " + stackPar.pop() + " e da pilha IMPAR o valor => " + stackImpar.pop());
                }

                else{
                    System.out.println("Erro: Uma ou nenhuma das pilhas nao podem ter valores removidos.");
                }

            }

            else if (valor % 2 == 1){
                stackImpar.push(valor);
            }

            else if( valor % 2 == 0 ){
                stackPar.push(valor);
            }

        }

        System.out.println("Pilha PAR => " + stackPar);
        System.out.println("Pilha IMPAR => " + stackImpar);

    }
}
