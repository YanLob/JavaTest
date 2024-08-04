package EstruturaDeDados.pilhas.Ex3;

public class Main {

    public static void main(String[] args) {
        Pilha<String> minhaPilha = new Pilha();
        Livro l1 = new Livro("Ideias para Adiar o Fim do Mundo", 2019, "Ailton Krenak");
        Livro l2 = new Livro("O Pequeno Príncipe", 1943, "Antoine de Saint-Exupéry");
        Livro l3 = new Livro("1984", 1949, "George Orwell");
        Livro l4 = new Livro("Dom Casmurro", 1899 , "Machado de Assis");
        Livro l5 = new Livro("Cem Anos de Solidão", 1967,"Gabriel García Márquez");
        Livro l6 = new Livro("A Revolução dos Bichos", 1945,"George Orwell");


        minhaPilha.push(l1.toString());
        minhaPilha.push(l2.toString());
        minhaPilha.push(l3.toString());
        minhaPilha.push(l4.toString());
        minhaPilha.push(l5.toString());
        minhaPilha.push(l6.toString());

        System.out.println("Tamanho da pilha => " + minhaPilha.size());

        System.out.println(minhaPilha.empty());

        System.out.println(minhaPilha.peek());

        for (int i = 0; i < 5; i++){
            if(!minhaPilha.empty()){

                System.out.println(minhaPilha.pop());
            }
        }

    }
}
