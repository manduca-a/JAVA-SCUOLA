/* Programma che acquisisce un nome e un numero da tastiera e li visualizza in output */

import java.io.*;
import java.awt.Frame.*;

public class RiceviStampa
{
	public static void main(String args[]) 
	{
		//Costruisce l'oggetto di accesso alla tastiera
		BufferedReader input = new BufferedReader(
		new InputStreamReader(System.in)
		);
		
		
	try
	{
		//Acquisisce il numero in una stringa
		System.out.println("Digita il nome: ");
		String nome = input.readLine();
		
		
		
		//Acquisisce il nome in una variabile di tipo intero
		System.out.println("digita il relativo importo: ");
		String linea = input.readLine();
		int saldo = Integer.parseInt( linea );
		
		
		
		//Stampa la riga
		System.out.println("Il Dott. " + nome + " ha un saldo pari a " + saldo + " €");
		
	}
	
	catch(IOException ex )
	{
		System.err.println("Si è verificato un errore");
		ex.printStackTrace();
	}
}
}