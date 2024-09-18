package progetti_scuola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgAnagrafica {

	public static void main(String[] args) {
		
		BufferedReader tastiera=new BufferedReader(new InputStreamReader(System.in));
		
		Anagrafica contatto = new Anagrafica ();
		System.out.println("Inserisci il nome: ");
		try 
		{
			contatto.nome= tastiera.readLine();
			
		}catch(IOException err) {}
		System.out.println("inserisci il cognome");
		try 
		{
			contatto.cognome= tastiera.readLine();
		}catch(IOException err)
		{}
		System.out.println("inserisci la matricola");
		try 
		{
			String matricola= tastiera.readLine();
			contatto.registraMatricola(matricola);
		}catch(IOException err)
		{}
		
		System.out.println("inserisci l'email: ");
		try 
		{
			String email= tastiera.readLine();
			contatto.registraEmail(email);
			
		}catch(IOException err) {}
		System.out.println("\n RIEPILOGO CONTATTO");
		contatto.stampaDati();
	}

}
