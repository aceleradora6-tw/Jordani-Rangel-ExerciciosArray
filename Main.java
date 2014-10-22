import java.util.ArrayList;

public class Main {
    private static ArrayList<String> lista = new ArrayList<String>();

    public static void main(String[] args){



    }

    public void adicionarPessoas(){
        lista.add("Lucas");
        lista.add("Henrique");
        lista.add("Paula");
        lista.add("Marcus");
        lista.add("Julia");
    }

    public void removerPessoa(int i){
        lista.remove(i);
    }

    public boolean estaNaLista(String nome){
        return lista.contains(nome);
    }



}
