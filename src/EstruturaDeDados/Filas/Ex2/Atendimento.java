package EstruturaDeDados.Filas.Ex2;

import java.util.Queue;

public class Atendimento {

    public Atendimento() {
        //...
    }

    protected void atendendoFilas(Queue<String> Filas){
        System.out.println(Filas.poll() + " foi atendida");
    }

}
