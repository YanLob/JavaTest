package engenhoca.SomaDeMatrizes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ControleMatriz somar = new ControleMatriz();

        List<Integer> matris1 = new ArrayList<>();
        List<Integer> matris2 = new ArrayList<>();

        //MATRIS1
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                matris1.add(i + j);
            }
        }

        //MATRIS2
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                matris2.add(i + j);
            }

        }

        somar.SomarMatriz(matris1, matris2);

    }
}
