package EstruturaDeDados.pilhas.Ex3;

import java.util.Vector;

public class Pilha<E> extends Vector<E> {

    public E push(E item){
        addElement(item);

        return item;
    }

    public E peek(){
        int tam = size();

        if(tam == 0){
            System.out.println(Error.class);
        }

        return elementAt(tam-1);
    }

    public E pop(){
        int tam = size();

        if(tam == 0){
            System.out.println(Error.class);
        }

        remove(tam-1);

        return elementAt(tam-2);

    }

    public boolean empty(){
        if(size() == 0){

            return true;
        }

        return false;
    }

}
