package JogoDaVelha;

import java.util.Scanner;

public class Tabuleiro {

    public void desenharJogo(Campo[][] velha){
        limparTela();
        System.out.println("    0      1     2");
        System.out.printf("0    %c   | %c  | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(),velha[0][2].getSimbolo());
        System.out.println("     --------------");
        System.out.printf("1    %c   | %c  | %c %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
        System.out.println("     --------------");
        System.out.printf("2    %c   | %c  | %c %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
    }

    public void iniciarJogo(Campo[][] velha){

        for (int l = 0; l < velha.length; l++){

            for (int c = 0; c < velha[0].length; c++){
                velha[l][c] = new Campo();
            }

        }

    }

    public void limparTela(){
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public boolean verificarJogada(Campo[][] velha, int p[], char simboloAtual){
        if (velha[p[0]][p[1]].getSimbolo() == ' ' ){
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }
        else{
            return false;
        }
    }

    public int[] jogar(Scanner sc, char simboloAtual){
        int p[] = new int[2];

        System.out.printf("%s %c%n", "Quem joga: ", simboloAtual);
        System.out.print("Digite a linha: ");
        p[0] = sc.nextInt();

        System.out.print("Digite a coluna: ");
        p[1] = sc.nextInt();

        return p;
    }

    public char verificarVitoria(Campo[][] velha){

        for (int l = 0; l < velha.length; l++){

            if(velha[l][0].getSimbolo() == 'X' && velha[l][1].getSimbolo() == 'X' && velha[l][2].getSimbolo() == 'X' ||
                    velha[l][0].getSimbolo() == 'O' && velha[l][1].getSimbolo() == 'O' && velha[l][2].getSimbolo() == 'O') {
                return velha[l][0].getSimbolo();
            }

        }

        for (int c = 0; c < velha.length; c++){

            if(velha[0][c].getSimbolo() == 'X' && velha[1][c].getSimbolo() == 'X' && velha[2][c].getSimbolo() == 'X' ||
                    velha[0][c].getSimbolo() == 'O' && velha[1][c].getSimbolo() == 'O' && velha[2][c].getSimbolo() == 'O'){
                return velha[0][c].getSimbolo();
            }

        }

        if(velha[0][0].getSimbolo() == 'X' && velha[1][1].getSimbolo() == 'X' && velha[2][2].getSimbolo() == 'X' || velha[0][2].getSimbolo() == 'X' && velha[1][1].getSimbolo() == 'X' && velha[2][0].getSimbolo() == 'X'){
            return  velha[1][1].getSimbolo();
        }

        if(velha[0][0].getSimbolo() == 'O' && velha[1][1].getSimbolo() == 'O' && velha[2][2].getSimbolo() == 'O' || velha[0][2].getSimbolo() == 'O' && velha[1][1].getSimbolo() == 'O' && velha[2][0].getSimbolo() == 'O'){
            return  velha[1][1].getSimbolo();
        }

        for (int l = 0; l < velha.length; l++){
            for (int c = 0; c < velha[0].length; c++){
                if(velha[l][c].getSimbolo() == ' ' ){
                    return ' ';
                }
            }
        }

        return 'V';
    }

}
