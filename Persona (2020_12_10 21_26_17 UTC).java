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
		String persone[][] = new String[10][3];
		 
		 int b;
		 int x = 0;
		 
		 
		 BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
	
	do {
		
	  JOptionPane.showMessageDialog(null, "Questa e' la piattaforma per l'identita'  delle persone", "Cerca persone", JOptionPane.INFORMATION_MESSAGE);
	  
	  Object[] possibleValues = {"Registra una nuova persona", "Cerca una persona"};
	  Object h= JOptionPane.showInputDialog(null, "Scegli l'opzione desiderata", "Cerca persone", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
	
	  if(h=="Registra una nuova persona")
	  {
		  line = JOptionPane.showInputDialog("Digita un nuovo codice");
		  codice = Integer.parseInt(line);
		  JOptionPane.showInputDialog(null, "Il codice e' stato registrato correttamente", + codice);
		  
		  cognome = JOptionPane.showInputDialog("Digita il cognome della persona da registrare");
		  JOptionPane.showMessageDialog(null, "Il cognome e' stato registrato correttamente");
		  
		  nome = JOptionPane.showInputDialog("Digita il nome della persona da registrare");
		  JOptionPane.showMessageDialog(null, "Il nome e' stato registrato correttamente");
		  
		  JOptionPane.showInputDialog(null, "Queste sono le informazioni della persona appena registrata","Codice:" + codice + "Nome:" + nome + "Cognome:" + cognome);
	  }
	  
	  for(int i=0; i<10; i++)
		{
			for(int j=0; j<3; j++)
			{
				persone[i][j]=line;
				persone[i][j]=nome;2
				persone[i][j]=cognome;
				
			}
		} 
	  
	  if(h=="Cerca una persona")
		  
		
	}
	while(x<10);
}
}
