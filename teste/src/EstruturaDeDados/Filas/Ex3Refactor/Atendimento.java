package EstruturaDeDados.Filas.Ex3Refactor;


public class Atendimento {

    public void atendimento (Pessoa pessoa){

        if(pessoa.getCodigo() == 0){

            System.out.println("Atendendo pessoa " + pessoa.getNome() + " com prioridade VERMELHA");
        }

        else if(pessoa.getCodigo() == 1){

            System.out.println("Atendendo pessoa " + pessoa.getNome() + " com prioridade AMARELA");
        }

        else if(pessoa.getCodigo() == 2){

            System.out.println("Atendendo pessoa " + pessoa.getNome() + " com prioridade VERDE");
        }

        else{

            System.out.println("Algo deu errado");
        }

    }

}
