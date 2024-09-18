/* Programma che stampa il prezzo */

import java.io.*;
import java.awt.Frame.*;

class Prezzo
{
	public static void main(String args[]) 
	{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);

		float prezzo = 100.00f;
		System.out.print( "Prezzo: " );
		System.out.print( prezzo );
		System.out.println( "Euro" );
	}
}