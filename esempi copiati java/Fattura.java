/*Programma per lo sconto progressivo */

import java.io.*;

public class Fattura
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in) );
		
        //Dichiarazione variabili
		int numPezzi;                                                  
		double totFattura;
		double sconto, importo;
		
		//Inserimento numPezzi e totFattura
		System.out.println("Inserire il numero di pezzi in fattura: ");
		String line = input.readLine();
		numPezzi = Integer.parseInt(line);
		System.out.println("Inserire il totale della fattura: ");
		line = input.readLine();
		totFattura = Float.parseFloat(line);
		
		//Calcolo dello sconto in base a numPezzi con selezione multipla
		switch (numPezzi)
		{
			case 1:
				sconto = totFattura * 0.15;
				break;
				
			case 2:
				sconto = totFattura * 0.2;
				break;
				
			case 3:
				sconto = totFattura * 0.3;
				break;
				
			default:
				sconto = totFattura * 0.4;
				break;
				
		}

		//Calcolo dell'importo
			importo = totFattura - sconto;
			
		//Stampa dei risultati
		System.out.println("L'importo da pagare è: " + importo);
		System.out.println("Lo sconto applicato è: " + sconto);
		
		}

}
	