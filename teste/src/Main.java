import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Forneca inteiro > 9: ");
        int valor = sc.nextInt();

        assert valor > 9;
        int soma = 0;

        for (int i = 0; i < valor; i++){
            soma+=i;

            assert soma < 99: "soma(" + soma + ") >=99";
        }

        System.out.println("soma [1.." + valor + "] = " + soma);
        
    }
}
