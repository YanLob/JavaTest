package EstruturaDeDados.pilhas;

import java.util.Stack;

public class StacksOuPilhas {
    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<>();

        int valor;

        //.PUSH coloca os valores em parenteses na sua pilha
        pilha.push(1);
        pilha.push(3);
        pilha.push(5);
        pilha.push(6);
        pilha.push(8);

        System.out.println(pilha);

        // o .PEEK retorna o ultimo valor da nossa pilha, mantendo esse valor na pilha
        System.out.println("Topo da pilha => " + pilha.peek());

        for (int i = 0; i < pilha.size(); i++) {
            valor = pilha.get(i);
            System.out.println(valor);
        }

        System.out.println();

        //O .POP retorna o ultimo valor da nossa pilha, POREM, tira o mesmo como exemplificado abaixo:
        System.out.println("Ex:. Pop => " + pilha.pop());
        System.out.println(pilha);

        //O .CLEAR limpa a Pilha inteira e o .EMPTY verifica se a pilha esta vazia ou nao
        pilha.clear();

        if(pilha.empty()){
            System.out.println("a Pilha esta vazia.");
        }

    }
}
