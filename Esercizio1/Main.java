package Esercizio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        //chiedo numero di parole da inserire
        System.out.print("Içnserisci il numero di parole: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        //dichiaro il Set per le parole distinte e per la lista di tutte le paroole
        Set<String> paroleDistinte = new HashSet<>();
        List<String> tutteParole = new ArrayList<>();

        //leggere le parole dell'utente
        System.out.println("inserisci le parole");
        for (int i = 0; i < n; i++){
            String parola = scanner.nextLine();
            tutteParole.add(parola);
            paroleDistinte.add(parola);
        }

        //identifico e stampo parole duplicate
        Set<String> paroleDuplicate = new HashSet<>();
        Set<String> paroleUniche = new HashSet<>();
        for (String parola : tutteParole){
            if (!paroleUniche.add(parola)){
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate:" + paroleDuplicate);

        //numero parole distinte
        System.out.println("Numero parole distinte: " + paroleDistinte.size());

        //elenco parole distinte
        System.out.println("Elenco parole distinte: " + paroleDistinte);

        scanner.close();

    }
}
