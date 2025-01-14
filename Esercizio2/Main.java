package Esercizio2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //chiedo numero elementi utente
        System.out.print("Inserisci numero di elementi (N): ");
        int n = scanner.nextInt();

        //funzione 1: genera lista di numeri casuali
        List<Integer> numeriCasuali = ListaUtils.generaNumeriCasuali(n);
        System.out.println("Lista ordinata di numeri casuali: " + numeriCasuali);

        //funzione 2: crea lista con elementi seguiti dagli stessi in ordine inverso
        List<Integer> listaInvertita = ListaUtils.creaListaInvertita(numeriCasuali);
        System.out.println("Lista ordinata di numeri casuali: " + listaInvertita);

        //funzione 3: stampa valori in posizione pari o dispari
        System.out.print("Vuoi stapare i valori in posizione pari? (true/false): ");
        boolean stampaPari = scanner.nextBoolean();
        ListaUtils.stampaValori(listaInvertita, stampaPari);

        scanner.close();
    }
}
