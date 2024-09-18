/* Programma che indovina il numero pensato dall'utente */

import java.io.*;
import java.awt.Frame.*;

public class Indovina
{
	public static void main(String args[]) 
	{
		//Costruisce l'oggetto di accesso alla tastiera
		BufferedReader input = new BufferedReader(
		new InputStreamReader(System.in)
		);
		
		
	try
	{
		//Acquisisce il primo numero
		System.out.println("digita il numero che hai pensato: ");
		String line = input.readLine();
		int numPensato = Integer.parseInt( line );
		System.out.println("Ora raddoppialo");
		int numCalcolato = numPensato*2;
		System.out.println("Somma al risultato 12");
		numCalcolato=numCalcolato+12;
		System.out.println("Dividi per 2");
		numCalcolato=numCalcolato/2;
		System.out.println("Sottrai al risultato il numero che hai pensato");
		numCalcolato=numCalcolato-numPensato;
		//Stampa il risultato
		System.out.println("In ogni caso il numero che hai pensato era 6!");
		System.out.println("Il valore ottenuto dai calcoli è: "+ numCalcolato);
		
	}
	
	catch(IOException ex )
	{
		System.out.println("Si è verificato un errore");
		ex.printStackTrace();
	}
}
}