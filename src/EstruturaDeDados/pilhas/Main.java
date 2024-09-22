package EstruturaDeDados.pilhas;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        String expressao1 = "((A+B) + A).B"; // Valida
        String expressao2 = "(A)+(C + D)"; // Valida
        String expressao3 = "(A+B)+D)"; // Invalida

        System.out.println("Expressão 1: " + VerificarSimbolos(expressao1));
        System.out.println("Expressão 2: " + VerificarSimbolos(expressao2));
        System.out.println("Expressão 3: " + VerificarSimbolos(expressao3));

    }

    //

    public static boolean VerificarSimbolos(String expressao){
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < expressao.length() ; i++){

            if(expressao.charAt(i) == '('){

                stack.push(expressao.charAt(i));
            } else if(expressao.charAt(i) == ')'){

                if(stack.isEmpty() || stack.pop() != '('){

                    return false;
                }
            }

        }

        return stack.isEmpty();

    }

}
