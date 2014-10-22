import java.util.ArrayList;

public class Main {
    private static ArrayList<String> listaNomes = new ArrayList<String>();

    public static void main(String[] args){



    }

    public void adicionarPessoas(){
        listaNomes.add("Lucas");
        listaNomes.add("Henrique");
        listaNomes.add("Paula");
        listaNomes.add("Marcus");
        listaNomes.add("Julia");
    }

    public void removerPessoa(int i){
        listaNomes.remove(i);
    }

    public boolean estaNaLista(String nome){
        return listaNomes.contains(nome);
    }

    public int tamanhoLista(){
        return listaNomes.size();
    }

    public void soma (ArrayList<Integer> lista){
        int total = 0;
        for (int i = 0;i < lista.size(); i++){
        total += lista.get(i);
        }
        System.out.println("Total da soma: " + total);
    }

    public ArrayList<Boolean> intArrayToBooleanArray (ArrayList<Integer> listaA, ArrayList<Integer> listaB){
        ArrayList<Boolean> listaC = new ArrayList<Boolean>();
        if (listaA.size() == listaB.size()){
            for (int i = 0; i < listaA.size(); i++){
                listaC.add (listaA.get(i) == listaB.get(i));
            }
        }
        return listaC;
    }

    

}
