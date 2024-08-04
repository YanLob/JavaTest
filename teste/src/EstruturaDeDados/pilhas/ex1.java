package EstruturaDeDados.pilhas;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Random random = new Random();
        int num, aleatorio;
        int contImpar = 0;

        for (int i = 0; i < 10; i++){

            System.out.print("Digite o " + (i+1) + " valor: ");
            num = sc.nextInt();

            if(num % 2 == 0){
                stack.push(num);
            }

            else if(num % 2 == 1){
                contImpar++;
            }

        }

        System.out.println("numeros impar"+contImpar);
        System.out.println(stack);
        System.out.println("tamanho da lista"+(stack.size()-1));

        for(int i=1; i<=stack.size(); i++){
            int tamanho = stack.size();

            for(int j=0; j<contImpar; j++){

                aleatorio = random.nextInt(tamanho);

                if(tamanho > contImpar){
                    stack.remove(aleatorio);
                }

            }

            if(stack.isEmpty()){
                System.out.println("Nao podemos remover mais");
                break;                                                                                                                                                                                                                                              
            }

        }

        System.out.println("Pilha => " + stack);

        sc.close();
    }
}
