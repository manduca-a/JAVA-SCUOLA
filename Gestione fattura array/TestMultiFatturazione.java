package TGF;

import java.io.*; //importazione pacchetto input/output
import java.util.ArrayList; //importazione pacchetto array dinamico

public class TestMultiFatturazione {

    public static void main(String[] args) throws IOException {

        ArrayList<Fattura> listaClienti = new ArrayList<Fattura>(); //creazione arraylistit
        int number; //variabile per decidere il numero di clienti
        String s; //stringa utilizzata nel momento delle domande per l'if

        //creazione oggetto lettura dati
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" In questo negozio vendiamo skateboard.");
        System.out.println(" Compila i campi richiesti.");

        System.out.println("Numero di clienti da registrare: ");
        String z = console.readLine();
        number = Integer.parseInt(z);

        //for per fare ripetere il processo per il numero di clienti presenti
        for (int i = 1; i <= number; i++) {

            Fattura fattura = new Fattura();//creazione classe

            System.out.println(" Digita il nome del " + i + "° cliente: ");
            fattura.setNome(console.readLine());

            System.out.println(" Digita il cognome del " + i + "° cliente: ");
            fattura.setCognome(console.readLine());

            System.out.println("Ecco l'articolo del giorno. ");
            System.out.println("Nome prodotto: Skateboard MID500 WOLF   ||  Prezzo: €40 ");
            System.out.println("Sai andare in skate? Lanciati nelle acrobazie con il MID500!");
            System.out.println("Uno skate conveniente e solido, per le prime acrobazie.");
            System.out.println(" Vuoi acquistare l'articolo del giorno? (s)");
            s = console.readLine();
            if (s.equals("s")) {
                System.out.println("Quanti articoli vuoi comprare? ");
                String alfa = console.readLine();
                fattura.setNo(Integer.parseInt(alfa));
                fattura.setall(Integer.parseInt(alfa));

            } else {
                System.out.println("Torni a trovarci.");
                break;
            }

        }

//Stampa lista clienti con tanto di nome,cognome,conto ecc...
        for (Fattura i : listaClienti) {
            System.out.println(" *****Lista Clienti***** ");
            System.out.println(i.getNome());
            System.out.println(i.getCognome());
            System.out.println(" ");
            System.out.println(i.getNo());
            System.out.println(i.getp());
            System.out.println(i.getop());
            System.out.println(" ");
            System.out.println(" ");

        }

    }
}
