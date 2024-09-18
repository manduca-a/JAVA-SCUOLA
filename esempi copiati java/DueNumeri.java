/* Programma che stampa due numeri */

import java.io.*;
import java.awt.Frame.*;

class DueNumeri
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);

		int numeroA = 100;
 		float numeroB = 3.14f;
		System.out.println(numeroA);
		System.out.println(numeroB);
	}
}