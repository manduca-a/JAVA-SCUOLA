/*Programma per il calcolo della divisione di numeri interi positivi tramite somma e sottrazione*/

import java.io.*;

public class Divisione
{
	public static void main(String args[]) throws Exception
	{
        //Variabile di input
		int dividendo, divisore;                                                     //dichiarazione variabili
		
		//Variabili di output
		int quoziente, resto;
		
		//Acquisisci dividendo, divisore
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in) );
		System.out.println("Inserire il dividendo: ");
		String line = input.readLine();                        						
	    dividendo = Integer.parseInt(line);
	    
		System.out.println("Inserire il divisore: ");
	    line = input.readLine();                        						
	    divisore = Integer.parseInt(line);
	    
	    //Inizializza il quoziente
	    quoziente = 0;
	    
	    //Eseguo il calcolo
	    while (dividendo >= divisore)
	    {
	    	dividendo = dividendo - divisore;
	    	quoziente++;
	    }
	    
	    //Il resto è ciò che resta del dividendo
	    resto=dividendo;
	    
	    //Comunica quoziente e resto	    
		System.out.println("Il quoziente è: " + quoziente);                
		System.out.println("Il resto è: " + resto);                          
	}

}
	