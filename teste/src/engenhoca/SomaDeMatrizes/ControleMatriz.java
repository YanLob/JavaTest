package engenhoca.SomaDeMatrizes;

import java.util.ArrayList;
import java.util.List;

public class ControleMatriz {

    public void SomarMatriz(List<Integer> matris1, List<Integer> matris2){
        List<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < matris1.size(); i++) {
            resultado.add(matris1.get(i) + matris2.get(i));
        }

        System.out.print("[ ");
        for (int i = 0; i < resultado.size(); i++) {


            System.out.print(resultado.get(i) + ", ");
            if ((i + 1) % 10 == 0) {
                System.out.print(']');
                System.out.println();
                System.out.print("[ ");
            }
        }
    }
    
}
