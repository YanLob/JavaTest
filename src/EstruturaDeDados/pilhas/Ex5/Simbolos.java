package EstruturaDeDados.pilhas.Ex5;

import java.util.Stack;

public class Simbolos {

    final String ABRE = "([{";
    final String FECHA = ")]}";

    public boolean verificarSimbilosBalanceados(String expressao){

        Stack<Character> stack = new Stack();
        int index = 0;
        char simbolo, topo;

        while(index < expressao.length()){
            simbolo = expressao.charAt(index);

            if(ABRE.indexOf(simbolo) > -1){

                stack.push(simbolo);
            } else if(FECHA.indexOf(simbolo) > -1){

                if(stack.isEmpty()){

                    return false;
                } else{

                    topo = stack.pop();

                    if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){

                        return false;
                    }

                }

            }

            index++;
        }

        return true;
    }

    public void imprimeResultado(String expressao){
        System.out.println(expressao + " esta balanceado? "+verificarSimbilosBalanceados(expressao));
    }


}
