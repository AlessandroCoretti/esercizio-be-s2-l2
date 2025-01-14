package Esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RubricaTelefonica rubrica = new RubricaTelefonica();

        boolean continua = true;
        while (continua) {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Rimuovi contatto");
            System.out.println("3. Cerca persona per numero");
            System.out.println("4. Cerca numero per nome");
            System.out.println("5. Stampa tutti i contatti");
            System.out.println("6. Esci");
            System.out.print("Scegli un'opzione: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma la newline

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci il numero di telefono: ");
                    String telefono = scanner.nextLine();
                    rubrica.aggiungiContatto(nome, telefono);
                    break;
                case 2:
                    System.out.print("Inserisci il nome del contatto da rimuovere: ");
                    String nomeDaRimuovere = scanner.nextLine();
                    rubrica.rimuoviContatto(nomeDaRimuovere);
                    break;
                case 3:
                    System.out.print("Inserisci il numero di telefono da cercare: ");
                    String numeroDaCercare = scanner.nextLine();
                    rubrica.ricercaPerNumero(numeroDaCercare);
                    break;
                case 4:
                    System.out.print("Inserisci il nome da cercare: ");
                    String nomeDaCercare = scanner.nextLine();
                    rubrica.ricercaPerNome(nomeDaCercare);
                    break;
                case 5:
                    rubrica.stampaContatti();
                    break;
                case 6:
                    continua = false;
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        }

        scanner.close();
    }
}
