/* Programma che dice se la regione inserita è un isola o no */

import java.io.*;
import java.awt.Frame.*;

public class Regioni
{
	public static void main(String args[]) throws Exception
	{
		
		System.out.println("Inserire l'età: ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in) );
		String regione = input.readLine();
		
		if (regione.contentEquals("Sicilia") || regione.equals("Sardegna") )
		{
			System.out.println("E' un' isola");
		}
		else 
		{
			System.out.println("Non è un 'isola");
		}
		
	}	
}
