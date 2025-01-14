package Esercizio3;

import java.util.HashMap;
import java.util.Map;

// classe per gestire rubrica telefonic<
public class RubricaTelefonica {
    private Map<String, String> rubrica;

    //costruttore
    public RubricaTelefonica() {
        this.rubrica = new HashMap<>();
    }

    //metodo 1: inserimento di una coppia <Nome, Telefono>
    public void aggiungiContatto(String nome, String telefono){
        rubrica.put(nome, telefono);
        System.out.println("Contatto aggiunto: " + nome + " -> " + telefono);
    }

    //metodo 2: cancellazione di un contatto a partire del nome
    public void rimuoviContatto(String nome) {
        if (rubrica.containsKey(nome)){
            rubrica.remove(nome);
            System.out.println("Contatto rimosso: " + nome);
        } else {
            System.out.println("Contatto non trovato: " + nome);
        }
    }

    //metodo 3: ricerca di una persona dato il numero di telefono
    public void ricercaPerNumero(String telefono){
        boolean trovato = false;
        for (Map.Entry<String, String> entry : rubrica.entrySet()){
            if (entry.getValue().equals(telefono)) {
                System.out.println("Numero trovato: " + telefono + " -> " + entry.getKey());
                trovato = true;
                break;
            }
        }
        if (!trovato){
            System.out.println("Nessuna persona trovata con il numero: " + telefono);
        }
    }

    //metodo 4: ricerca di telefono dato il nome
    public void ricercaPerNome(String nome){
        if (rubrica.containsKey(nome)){
            System.out.println("Nome trovato: " + nome + " -> " + rubrica.get(nome));
        } else {
            System.out.println("Nessun numero trovato per il nome: " + nome);
        }
    }
            //metodo 5: stampo tutti i contatti
    public void stampaContatti(){
        if (rubrica.isEmpty()){
            System.out.println("Nessun contatto");
        } else {
            System.out.println("Elenco contatti: ");
            for (Map.Entry<String, String> entry : rubrica.entrySet()){
                System.out.println(entry.getKey() + " -> " +entry.getValue());
            }
        }
    }
}
