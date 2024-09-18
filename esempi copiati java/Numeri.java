/*Programma che mostra la somma dei primi 10 numeri */

import java.io.*;

public class Numeri
{
	public static void main(String args[]) throws Exception
	{
        //Dichiarazione variabili
		int parziale = 0;                                                  
		int i;
		
		//Ciclo for che visualizza la somma dei primi 10 numeri
		for (i=1;i<=10;i++)
		{
			parziale+=i;
		    System.out.println(i + " - " + parziale);
		}
	
	}

}
	