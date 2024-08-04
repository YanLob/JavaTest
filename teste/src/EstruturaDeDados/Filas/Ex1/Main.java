package EstruturaDeDados.Filas.Ex1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Documentos d1 = new Documentos("Origem", 3);
        Documentos d2 = new Documentos("Aproveitamento", 5);
        Documentos d3 = new Documentos("Destino", 4);

        Queue<Documentos> filas = new LinkedList<Documentos>();

        filas.offer(d1);
        filas.offer(d2);
        filas.offer(d3);

        while(!filas.isEmpty()){

            System.out.println("-");

            Documentos doc = filas.poll();

            for(int i = 1; i <= doc.getQntFolhas(); i++){
                System.out.println("documento '" + doc.getNome() + "' Emprimindo a folha " + (i));
            }

        }


    }

}
