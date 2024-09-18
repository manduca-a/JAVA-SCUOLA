/* Programma che indovina il numero pensato dall'utente */

import java.io.*;
import java.awt.Frame.*;

public class Indovina1
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in) );
		
		//Dichiarazione costanti
		final int Costante = 15;
		
		//Dichiarazione variabili
		int num;
		String risposta;
		
		//Ciclo che termina quando l'utente digita "s"
		do
		{
			//Acquisisci numero da tastiera
			System.out.println("Inserire un numero: ");
			String line = input.readLine();
			num = Integer.parseInt( line );
			
			//Se il numero è uguale a quello pensato
			if (num == Costante)
			{
					System.out.println("numero trovato!");
					//istruzione che forza l'uscita dal ciclo while
					break;
			}
			//Controlla se ci sono altri numeri
			System.out.println("Sono finiti i numeri? (s/n) ");
			risposta = input.readLine();
		}
		while (risposta.equals("n") );
	}
}
