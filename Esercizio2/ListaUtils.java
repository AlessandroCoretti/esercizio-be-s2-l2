package Esercizio2;

import java.util.*;

public class ListaUtils {

    //funzione 1 : genera una lista ordinata di N numeri casuali tra 0 e 100
    public static List<Integer> generaNumeriCasuali(int n) {
        Random random = new Random();
        List<Integer> numeri = new ArrayList<>();
        for (int i = 0; i < n; i++){
            numeri.add(random.nextInt(101));//aggiunge numero casule tra 0 e 100
        }
        Collections.sort(numeri);//ordino la lista
        return numeri;
    }

    //funzione 2: crea una nuova lista con elementi seguiti dagli stessi in ordine inverso
    public static List<Integer> creaListaInvertita(List<Integer> lista){
        List<Integer> nuovaLista = new ArrayList<>(lista);
        List<Integer> listaInversa = new ArrayList<>(lista);
        Collections.reverse(listaInversa);
        nuovaLista.addAll(listaInversa);
        return nuovaLista;
    }

    //funzione 3: stampa i valori in posizione pari o dispari a seconda del bool
    public static void stampaValori(List<Integer> lista, boolean stampaPari) {
        System.out.println(stampaPari ? "Valori in posizione pari: " : "Valori in posizione dispari: ");
        for (int i = 0; i < lista.size(); i++){
            if ((i % 2 == 0 && stampaPari) || (i % 2 != 0 && !stampaPari)){
                System.out.print(lista.get(i) + " ");
            }
        }
        System.out.println();
    }
}
