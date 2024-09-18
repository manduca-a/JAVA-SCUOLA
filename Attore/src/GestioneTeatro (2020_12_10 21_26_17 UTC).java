import java.io.*; // importo il pacchetto per l'Input Output
import javax.swing.JOptionPane;

public class GestioneTeatro 
{
	public static void main(String[] s) {

	// creo un oggetto per leggere dati dalla finestra di console
        BufferedReader console = new BufferedReader(
       	    new InputStreamReader(System.in));
        
        Attore attore1 = new Attore();
    	Attore attore2 = new Attore();
    	Attore attore3 = new Attore();
        
	String nomeAttore = JOptionPane.showInputDialog(null, "Digita il nome del primo attore");
	    attore1.setNome(getNome());
	
      
	String Mese = JOptionPane.showInputDialog(null,"Mese dell'ingaggio?");
    int mese = Integer.parseInt(Mese);
	boolean datoErrato = true;
do {
        try
        {
            // converto la stringa in intero:
            attore1.setMese(Integer.parseInt(Mese));
            datoErrato = false;
        }
        catch (NumberFormatException e)
        {
        	JOptionPane.showMessageDialog(null, "devi darmi un intero! Riprova: ");
        	System.exit(1);
        }
    }
    while (datoErrato);

	String Giorno = JOptionPane.showInputDialog(null,"Giorno dell'ingaggio?");
	int giorno = Integer.parseInt(Giorno);    
	datoErrato = true;
	do {
            try
            {
                // converto la stringa in intero:
                attore1.setGiorno(Integer.parseInt(Giorno));
                datoErrato = false;
            }
            catch (NumberFormatException e)
            {
            	JOptionPane.showMessageDialog(null, "devi darmi un intero! Riprova: ");
            	System.exit(1);
            }
            
            
            
        }
        while (datoErrato);

	nomeAttore = JOptionPane.showInputDialog(null,"Digita il nome del secondo attore");
	attore2.setNome(nomeAttore());
	
	Mese = JOptionPane.showInputDialog(null,"Mese dell'ingaggio?");
	mese = Integer.parseInt(Mese);
	datoErrato = true;
do {
        try
        {
            // converto la stringa in intero:
            attore2.setMese(Integer.parseInt(Mese));
            datoErrato = false;
        }
        catch (NumberFormatException e)
        {
        	JOptionPane.showMessageDialog(null, "devi darmi un intero! Riprova: ");
        	System.exit(1);
        }
    }
    while (datoErrato);

Giorno = JOptionPane.showInputDialog(null,"Giorno dell'ingaggio?");
giorno = Integer.parseInt(Giorno);        
datoErrato = true;
	do {
            try
            {
                // converto la stringa in intero:
                attore2.setGiorno(Integer.parseInt(Mese));
                datoErrato = false;
            }
            catch (NumberFormatException e)
            {
            	JOptionPane.showMessageDialog(null, "devi darmi un intero! Riprova: ");
            	System.exit(1);
            }
        }
        while (datoErrato);

	

	// attore 3:
	nomeAttore = JOptionPane.showInputDialog(null,"Digita il nome del terzo attore");
	attore3.setNome(nomeAttore());
	
	Mese = JOptionPane.showInputDialog(null, "Mese dell'ingaggio?");
	mese = Integer.parseInt(Mese);
	datoErrato = true;
do {
        try
        {
            // converto la stringa in intero:
            attore3.setMese(Integer.parseInt(Mese));
            datoErrato = false;
        }
        catch (NumberFormatException e)
        {
        	JOptionPane.showMessageDialog(null, "devi darmi un intero! Riprova: ");
        	System.exit(1);
        }
    }
    while (datoErrato);
	
Giorno = JOptionPane.showInputDialog(null, "Giorno dell'ingaggio?");
giorno = Integer.parseInt(Giorno);        
datoErrato = true;
	do {
            try
            {
                // converto la stringa in intero:
                attore3.setGiorno(Integer.parseInt(Mese));
                datoErrato = false;
            }
            catch (NumberFormatException e)
            {
            	JOptionPane.showMessageDialog(null, "devi darmi un intero! Riprova: ");
            	System.exit(1);
            }
        }
        while (datoErrato);

	

	/// Stampo il programma del teatro: 
	System.out.println("\n\n\n\n\n");
	System.out.println("********** Programma del teatro: ***********");
	System.out.println(attore1.getNome());
	System.out.println(attore1.getData());
	System.out.println();
	System.out.println(attore2.getNome());
	System.out.println(attore2.getData());
	System.out.println();
	System.out.println(attore3.getNome());
	System.out.println(attore3.getData());
	System.out.println();
    }

	public static String getNome() {
		return nomeAttore();
	    }

	private static String giorno() {
		return null;
	}

	private static String mese() {
		return null;
	}

	static String nomeAttore() {
		return null;
	}
}