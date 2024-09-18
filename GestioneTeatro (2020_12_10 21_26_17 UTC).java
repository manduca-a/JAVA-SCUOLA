
// Antonio Manduca 4^E
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

public class GestioneTeatro {

	public static void main(String[] args) {
		 BufferedReader console = new BufferedReader(
		       	    new InputStreamReader(System.in));
		        
		        Attore attore1 = new Attore();
		    	Attore attore2 = new Attore();
		    	Attore attore3 = new Attore();
		        
			String nomeAttore = JOptionPane.showInputDialog(null, "Digita il nome del primo attore");
			    attore1.setNome(nomeAttore);
			
		      
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

			String giorno = JOptionPane.showInputDialog(null,"Giorno dell'ingaggio?");
			
			datoErrato = true;
			do {
		            try
		            {
		                // converto la stringa in intero:
		                attore1.setGiorno(Integer.parseInt(giorno));
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
			attore2.setNome(nomeAttore);
			
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

		giorno = JOptionPane.showInputDialog(null,"Giorno dell'ingaggio?");
		     
		datoErrato = true;
			do {
		            try
		            {
		                // converto la stringa in intero:
		                attore2.setGiorno(Integer.parseInt(giorno));
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
			attore3.setNome(nomeAttore);
			
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
			
		giorno = JOptionPane.showInputDialog(null, "Giorno dell'ingaggio?");
		 
		datoErrato = true;
			do {
		            try
		            {
		                // converto la stringa in intero:
		                attore3.setGiorno(Integer.parseInt(giorno));
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
			JOptionPane.showMessageDialog(null, attore1.getNome() + " " + attore1.getData() + " " + attore2.getNome() + " " + attore2.getData() + " " + attore3.getNome() + " " + attore3.getData() , "********** Programma del teatro ***********", 0);
		    }
			private static String setNome(String nomeAttore) {
		// TODO Auto-generated method stub
		return null;
	}	
		}