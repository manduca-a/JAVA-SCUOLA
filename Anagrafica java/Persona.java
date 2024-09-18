import java.io.*;
import javax.swing.*;
import java.util.*;

public class Persona 
{

	
	public static void main(String[] args) throws IOException
	{
		String line;
		String nome;
		String cognome;
		int codice;
		String persone[][] = new String[3][10];
		 
		 int b;
		 boolean x = true;
		 
		 
		 BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
	
	do {
		
	  JOptionPane.showMessageDialog(null, "Questa è la piattaforma per l'identità delle persone", "Cerca persone", JOptionPane.INFORMATION_MESSAGE);
	  
	  Object[] possibleValues = {"Registra una nuova persona", "Cerca una persona"};
	  Object h= JOptionPane.showInputDialog(null, "Scegli l'opzione desiderata", "Cerca persone", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
	
	  if(h=="Registra una nuova persona")
	  {
		  line = JOptionPane.showInputDialog("Digita un nuovo codice");
		  codice = Integer.parseInt(line);
		  JOptionPane.showInputDialog(null, "Il codice è stato registrato correttamente", + codice);
		  
		  cognome = JOptionPane.showInputDialog("Digita il cognome della persona da registrare");
		  JOptionPane.showMessageDialog(null, "Il cognome è stato registrato correttamente");
		  
		  nome = JOptionPane.showInputDialog("Digita il nome della persona da registrare");
		  JOptionPane.showMessageDialog(null, "Il nome è stato registrato correttamente");
		  
		  JOptionPane.showInputDialog(null, "Queste sono le informazioni della persona appena registrata","Codice:" + codice + "Nome:" + nome + "Cognome:" + cognome);
		  
		  persone[0][0]=line;
			persone[1][0]=nome;
			persone[2][0]=cognome;
			
			for(int i=0; i<3; i++)
			{
			   System.out.println(persone[i][0]);
			}
		  
	  }
		
	}
	while(x==true);
}
}
