package EstruturaDeDados.pilhas.Ex4;

import EstruturaDeDados.pilhas.Ex3.Livro;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Livro l1 = new Livro("Ideias para Adiar o Fim do Mundo", 2019, "Ailton Krenak");
        Livro l2 = new Livro("O Pequeno Príncipe", 1943, "Antoine de Saint-Exupéry");
        Livro l3 = new Livro("1984", 1949, "George Orwell");
        Livro l4 = new Livro("Dom Casmurro", 1899 , "Machado de Assis");
        Livro l5 = new Livro("Cem Anos de Solidão", 1967,"Gabriel García Márquez");
        Livro l6 = new Livro("A Revolução dos Bichos", 1945,"George Orwell");


        stack.push(l1.toString());
        stack.push(l2.toString());
        stack.push(l3.toString());
        stack.push(l4.toString());
        stack.push(l5.toString());
        stack.push(l6.toString());

        System.out.println("Tamanho da pilha => " + stack.size());

        System.out.println(stack.empty());

        System.out.println(stack.peek());

        for (int i = 0; i < 5; i++){
            if(!stack.empty()){

                System.out.println(stack.pop());
            }
        }

    }
}
