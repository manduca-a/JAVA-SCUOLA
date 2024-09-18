/* Programma che moltiplica due numeri interi positivi usando solo la somma */

import java.io.*;
import java.awt.Frame.*;

public class Prodotto
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in) );
		//Dichiarazione variabili
		int fattore1, fattore2;
		int prodotto;
		int i;
		
		//Lettura dei due fattori
		System.out.println("Inserire il primo fattore: ");
		String line = input.readLine();
		fattore1 = Integer.parseInt( line );

		System.out.println("digita il secondo fattore: ");
		line = input.readLine();
		fattore2 = Integer.parseInt( line );
		
		prodotto = 0;
		
		//Ciclo che accumula risultato nella var. prodotto
		for (i = 1; i <=fattore2; i++)
		{
			prodotto = prodotto + fattore1;
		}
		
		//Stampa dei risultati
		System.out.println("Il prodotto vale: " + prodotto);
		
	}
	
}