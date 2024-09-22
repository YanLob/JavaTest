package EstruturaDeDados.Filas.Ex3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        Queue<String> filaPVermelho = new LinkedList<>();
        Queue<String> filaPAmarelo = new LinkedList<>();
        Queue<String> filaVerde = new LinkedList<>();


        String[] cores = {"vermelho", "amarelo", "verde"};

        // adicionando 6 pessoas a fila com codigos aleatorios
        for (int i = 0; i < 6; i++) {
            String codigo = cores[random.nextInt(3)];

            String org = ("Pessoa " + (i + 1) + ": " + codigo);

            if(codigo.equals("vermelho")){
                filaPVermelho.offer(org);
            }
            else if(codigo.equals("amarelo")){
                filaPAmarelo.offer(org);
            }
            else{
                filaVerde.offer(org);
            }
        }

        // verificando a ordem a ser atendida
        while(true){

            if(!filaPVermelho.isEmpty()){

                Atendimento(filaPVermelho);
            }

            else if(!filaPAmarelo.isEmpty()){

                Atendimento(filaPAmarelo);
            }

            else if(!filaVerde.isEmpty()){

                Atendimento(filaVerde);
            }

            else{

                break;
            }



            try{
                TimeUnit.SECONDS.sleep(2);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }

    }

    // metodo de atendimento
    public static void Atendimento (Queue<String> fila){
        System.out.println(fila.poll() + " foi atendida");
    }

}
