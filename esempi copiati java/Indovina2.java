/* Programma che indovina il numero pensato dall'utente */

import java.io.*;
import java.awt.Frame.*;

public class Indovina2
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in) );
		
		//Dichiarazione costanti
		final int Costante = 15;
		
		//Dichiarazione variabili
		int num;
		String risposta;
		
		//Ciclo infinito che termina solo con break
		while(true)
		{
			//Acquisisci numero da tastiera
			System.out.println("Inserire un numero: ");
			String line = input.readLine();
			num = Integer.parseInt( line );
			
			//Se il numero è uguale a quello pensato
			if (num != Costante)
			{
				//se numero diverso da quello da indovinare
				//si ricomincia dal ciclo while
				continue;
			}
			//Quando il numero è stato trovato con break si esce dal ciclo while
			break;
			
		}
			
			System.out.println("numero trovato! ");
			
	}
	
}