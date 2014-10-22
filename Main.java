import java.util.ArrayList;

public class Main {
    private static ArrayList<String> listaNomes = new ArrayList<String>();

    public static void main(String[] args){
        adicionarPessoas();
        System.out.println(listaNomes);
        removerPessoa(2);
        System.out.println(listaNomes);
        System.out.println("Lucas está na lista? " + estaNaLista("Lucas"));
        System.out.println("Tamanho da lista: " + tamanhoLista());

        ArrayList<Integer> listaInteiros1 = new ArrayList<Integer>();
        listaInteiros1.add(5);
        listaInteiros1.add(3);
        listaInteiros1.add(13);
        listaInteiros1.add(10);
        listaInteiros1.add(10);
        System.out.println(listaInteiros1);
        soma(listaInteiros1);

        ArrayList<Integer> listaInteiros2 = new ArrayList<Integer>();
        listaInteiros2.add(5);
        listaInteiros2.add(19);
        listaInteiros2.add(10);
        listaInteiros2.add(5);
        listaInteiros2.add(10);
        System.out.println(listaInteiros2);

        System.out.println(intArrayToBooleanArray(listaInteiros1, listaInteiros2));

        System.out.println(interseccaoArrays(listaInteiros1, listaInteiros2));

        System.out.println(uniaoArrays(listaInteiros1, listaInteiros2));

    }

    public static void adicionarPessoas(){
        listaNomes.add("Lucas");
        listaNomes.add("Henrique");
        listaNomes.add("Paula");
        listaNomes.add("Marcus");
        listaNomes.add("Julia");
    }

    public static void removerPessoa(int i){
        listaNomes.remove(i);
    }

    public static boolean estaNaLista(String nome){
        return listaNomes.contains(nome);
    }

    public static int tamanhoLista(){
        return listaNomes.size();
    }

    public static void soma (ArrayList<Integer> lista){
        int total = 0;
        for (int i = 0;i < lista.size(); i++){
        total += lista.get(i);
        }
        System.out.println("Total da soma: " + total);
    }

    public static ArrayList<Boolean> intArrayToBooleanArray (ArrayList<Integer> listaA, ArrayList<Integer> listaB){
        ArrayList<Boolean> listaC = new ArrayList<Boolean>();
        if (listaA.size() == listaB.size()){
            for (int i = 0; i < listaA.size(); i++){
                listaC.add (listaA.get(i) == listaB.get(i));
            }
        }
        return listaC;
    }

    public static ArrayList<Integer> interseccaoArrays (ArrayList<Integer> listaA, ArrayList<Integer> listaB){
        ArrayList<Integer> listaC = new ArrayList<Integer>();
        for (int i = 0; i < listaA.size(); i++){
            if (listaB.contains(listaA.get(i)) && !listaC.contains(listaA.get(i))){
                listaC.add(listaA.get(i));
            }
        }
        return listaC;
    }

    public static ArrayList<Integer> uniaoArrays (ArrayList<Integer> listaA, ArrayList<Integer> listaB){
        ArrayList<Integer> listaC = new ArrayList<Integer>();
        listaC.addAll(listaA);
        for (int i = 0; i < listaB.size(); i++){
            if (!listaC.contains(listaB.get(i))){
                listaC.add(listaB.get(i));
            }
        }
        return listaC;
    }

}
