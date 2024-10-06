import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char array[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
                        'H', 'I', 'J', 'K', 'L', 'M', 'N',
                        'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                        'V', 'W', 'X', 'Y', 'Z'};


        System.out.print("Digite um valor: ");
        int resp = sc.nextInt();

        if( resp >= 1 && resp <= 26 ){

            System.out.print("{ ");

            for (int i = 0; i < resp; i++){
                System.out.print(array[i] + "; ");
            }
            System.out.print("}");

        } else{ System.out.println("Valor tem numero maior ou menor que a quantia total do alfabeto"); }

    }
}