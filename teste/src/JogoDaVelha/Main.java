package JogoDaVelha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Campo[][] velha = new Campo[3][3];
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner sc = new Scanner(System.in);
        boolean jogando = true;
        char simboloAtual = 'X';
        char vitoria = ' ';

        tabuleiro.iniciarJogo(velha);

        while(jogando){

            tabuleiro.desenharJogo(velha);

            vitoria = tabuleiro.verificarVitoria(velha);
            if(vitoria == 'X' || vitoria == 'O'){
                System.out.printf("%s%c", "Vencedor => ",vitoria);
                break;
            }
            else if (vitoria == 'V'){
                System.out.println("Deu velha!");
                break;
            }

            try{
                if( tabuleiro.verificarJogada(velha, tabuleiro.jogar(sc, simboloAtual), simboloAtual )){

                    if(simboloAtual == 'X'){
                        simboloAtual = 'O';
                    }
                    else{
                        simboloAtual = 'X';
                    }
                }
            }catch(Exception e){
                System.out.println("Erro");
            }

        }

    }

}
